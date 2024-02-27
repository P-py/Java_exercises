package chapter13;

import java.time.LocalDateTime;
import entities.enums.OrderStatus;
import entities_chapter13.Order;

public class EnumExample{
	public static void main(String[] args) {
		Order order = new Order(1, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		if (os1==os2) {
			System.out.println("os1 equal os2");
		}
	}
}