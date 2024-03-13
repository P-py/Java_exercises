package chapter15;

//Util
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Exceptions
import chapter15.exceptions.DomainException;

//Entities
import entities_chapter15.Reservation;

public class HotelManager{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.printf("\nRoom number: ");
			int number = Integer.valueOf(sc.nextLine());
			System.out.printf("\nCheck-in date (dd/mm/yyyy): ");
			LocalDate checkin = LocalDate.parse(sc.nextLine(), formatter);
			System.out.printf("\nCheck-out date (dd/mm/yyyy): ");
			LocalDate checkout = LocalDate.parse(sc.nextLine(), formatter);
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation.toString());
			
			System.out.printf("\nEnter data to update the reservation: \n");
			System.out.printf("\nCheck-in date (dd/mm/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), formatter);
			System.out.printf("\nCheck-out date (dd/mm/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), formatter);
			
			reservation.updateDates(checkin, checkout);
			System.out.println(reservation);
		}
		//Generic errors
		catch (RuntimeException e) {
			System.out.println("Unexpected error: "+e.getMessage());
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: "+e.getMessage());
		}
		
		sc.close();
	}
}