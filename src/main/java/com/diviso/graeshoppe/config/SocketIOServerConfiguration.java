package com.diviso.graeshoppe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.corundumstudio.socketio.SocketIOServer;

@Configuration
public class SocketIOServerConfiguration {

	@Bean
	public SocketIOServer getSocketIoServer() {
		com.corundumstudio.socketio.Configuration configuration = new com.corundumstudio.socketio.Configuration();
		configuration.setHostname("localhost");
		configuration.setPort(9092);
		SocketIOServer ioServer = new SocketIOServer(configuration);
		ioServer.start();
		return ioServer;
	}

}
