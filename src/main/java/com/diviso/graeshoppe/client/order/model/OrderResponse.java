package com.diviso.graeshoppe.client.order.model;

public class OrderResponse {

	private CommandResource commandResource;
	private Order order;
	/**
	 * @return the commandResource
	 */
	public CommandResource getCommandResource() {
		return commandResource;
	}
	@Override
	public String toString() {
		return String.format("OrderResponse [commandResource=%s,\n order=%s]", commandResource, order);
	}
	/**
	 * @param commandResource the commandResource to set
	 */
	public void setCommandResource(CommandResource commandResource) {
		this.commandResource = commandResource;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
}
