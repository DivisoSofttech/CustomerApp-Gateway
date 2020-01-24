package com.diviso.graeshoppe.customerappgateway.service;

import com.corundumstudio.socketio.SocketIOServer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.customerappgateway.config.KafkaProperties;
import com.diviso.graeshoppe.notification.avro.Notification;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class NotificationService {

	private final Logger log = LoggerFactory.getLogger(NotificationService.class);

	@Autowired
	private SocketIOServer socketIOServer;

	private final AtomicBoolean closed = new AtomicBoolean(false);

	@Value("${topic.notification}")
	public String notificationTopic;

	private final KafkaProperties kafkaProperties;
	private ExecutorService sseExecutorService = Executors.newCachedThreadPool();

	private KafkaConsumer<String, Notification> kafkaConsumer;

	public NotificationService(KafkaProperties kafkaProperties) {
		this.kafkaProperties = kafkaProperties;
	}

	public void subscribeToNotification() {
		log.debug("REST request to consume records from Kafka topics {}", notificationTopic);
		Map<String, Object> consumerProps = kafkaProperties.getConsumerProps();
		sseExecutorService.execute(() -> {
			KafkaConsumer<String, Notification> consumer = new KafkaConsumer<>(consumerProps);
			consumer.subscribe(Collections.singletonList(notificationTopic));
			boolean exitLoop = false;
			while (!exitLoop) {
				try {
					ConsumerRecords<String, Notification> records = consumer.poll(Duration.ofSeconds(3));
					records.forEach(record -> {
						log.info("notificationTopic  is consuming " + record);

						Notification notification = record.value();
						if (notification.getType().equals("Order-Placed")
								|| notification.getType().equals("Order-Approved")
								|| notification.getType().equals("Order-Delivered")) {
							log.info("In If condition &&&&&&&&&&&&");
							sendNotification(notification);
						}

					});

				} catch (Exception ex) {
					ex.printStackTrace();
					log.trace("Complete with error {}", ex.getMessage(), ex);
					exitLoop = true;
				}
			}
			log.info("Consumer is going to close");
			//consumer.close();
		});
	}

	public void startConsumers() {
		subscribeToNotification();
	}

	public KafkaConsumer<String, Notification> getKafkaConsumer() {
		return kafkaConsumer;
	}

	public void shutdown() {
		log.info("Shutdown Kafka consumer");
		closed.set(true);
		kafkaConsumer.wakeup();
	}

	private void sendNotification(Notification message) {
		log.info("Notification is send via socket server");
		NotificationDTO notificationDTO = new NotificationDTO();
		notificationDTO
				.setDate(OffsetDateTime.ofInstant(Instant.ofEpochMilli(message.getDate()), ZoneId.systemDefault()));
		notificationDTO.setTitle(message.getTitle());
		notificationDTO.setMessage(message.getMessage());
		notificationDTO.setTargetId(message.getTargetId());
		notificationDTO.setReceiverId(message.getReceiverId());
		notificationDTO.setId(message.getId());
		notificationDTO.setStatus(message.getStatus());
		socketIOServer.getBroadcastOperations().sendEvent(message.getReceiverId(), notificationDTO);
	}
}
