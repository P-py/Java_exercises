package chapter10;

import java.util.Locale;
import java.util.Scanner;
import entities_chapter10.Rent;

public class Ex12{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberOfRooms;
		
		do {
			System.out.printf("\nHow many rooms will be rented? ");
			numberOfRooms = sc.nextInt();
			if (numberOfRooms>10||numberOfRooms<1) {
				System.out.printf("\nPlease type in a number between 1 and 10...");
			}
		}while(numberOfRooms>10||numberOfRooms<1);
		Rent rooms[] = new Rent[10];
		for (int i=0; i<numberOfRooms; i++) {
			System.out.printf("\nRent #%d data: ", i+1);
			System.out.printf("\nName: ");
			sc.nextLine();
			String rentName = sc.nextLine();
			System.out.printf("E-mail: ");
			String rentEmail = sc.nextLine();
			System.out.printf("Room number: ");
			int rentRoomNumber = sc.nextInt();
			do {
				if (rentRoomNumber>10||rentRoomNumber<1) {
					System.out.printf("\nPlease, type in a room number between 1 and 10: ");
					rentRoomNumber = sc.nextInt();
				}
			}while(rentRoomNumber>10||rentRoomNumber<1);
			Rent rentObject = new Rent(rentName, rentEmail);
			rooms[rentRoomNumber-1] = rentObject;
		}
		System.out.println("\nBusy Rooms: ");
		for (int i=0; i<10; i++) {
			if(rooms[i]!=null){
				System.out.printf("%d: %s, %s\n", i+1, rooms[i].getName(), rooms[i].getEmail());
			}
		}
		
		sc.close();
	}
}