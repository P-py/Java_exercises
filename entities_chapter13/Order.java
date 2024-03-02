package entities_chapter13;

import java.time.LocalDateTime;
import entities.enums.OrderStatus;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> itemList = new ArrayList<>();
	private Client client;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	public Order() {
	}
	public Order(LocalDateTime inputMoment, OrderStatus inputStatus, Client inputClient) {
		this.moment = inputMoment;
		this.status = inputStatus;
		this.client = inputClient;
	}
	public String getStatus() {
		return status.toString();
	}
	public String getMoment() {
		return moment.format(formatter).toString();
	}
	public Client getClient() {
		return client;
	}
	public void setStatus(OrderStatus inputStatus) {
		this.status = inputStatus;
	}
	public void setMoment(LocalDateTime inputMoment) {
		this.moment = inputMoment;
	}
	public void setClient(Client inputClient) {
		this.client = inputClient;
	}
	public void addOrderItem(OrderItem inputItem) {
		itemList.add(inputItem);
	}
	public void removeOrderItem(OrderItem inputItem) {
		itemList.remove(inputItem);
	}
	public Double total() {
		double totalSum=0;
		for (OrderItem item : itemList) {
			totalSum += item.subTotal();
		}
		return totalSum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY\n");
		sb.append("Order moment: "+getMoment()+"\n");
		sb.append("Order status: "+status.toString()+"\n");
		sb.append("Client: "+client.toString()+"\n");
		sb.append("Order items: \n");
		for (OrderItem item : itemList) {
			sb.append(item+"\n");
		}
		sb.append("Total price: $"+total());
		return sb.toString();
	}
}
