package chapter15;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities_chapter15.Reservation;

public class HotelManager{
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.printf("\nRoom number: ");
		int number = Integer.valueOf(sc.nextLine());
		System.out.printf("\nCheck-in date (dd/mm/yyyy): ");
		LocalDate checkin = LocalDate.parse(sc.nextLine(), formatter);
		System.out.printf("\nCheck-out date (dd/mm/yyyy): ");
		LocalDate checkout = LocalDate.parse(sc.nextLine(), formatter);
		
		if (!checkout.isAfter(checkin)) {
			System.out.println("Error in reservation: check-out date must be after check-in.");
		}
		else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation.toString());
			System.out.printf("\nEnter data to update the reservation: \n");
			System.out.printf("\nCheck-in date (dd/mm/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), formatter);
			System.out.printf("\nCheck-out date (dd/mm/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), formatter);
			
			LocalDate now = LocalDate.now();
			if (checkin.isAfter(now)&&checkout.isAfter(now)) {
				if (!checkout.isAfter(checkin)) {
					System.out.println("Error in update: check-out date must be after check-in.");
				}
				else {
					reservation.updateDates(checkin, checkout);
				}
			}
			else {
				System.out.println("Error in update: Dates for update must be at future.");
			}
			
			reservation.updateDates(checkin, checkout);
		}
		
		
		sc.close();
	}
}