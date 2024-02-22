package chapter11;

import java.util.Locale;
import java.util.Scanner;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHour{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); //Local date without time
		LocalDateTime d02 = LocalDateTime.now(); //Local date with time
		Instant d03 = Instant.now(); //Local date with time and timezone
		
		//Parsing a ISO8601 text into a LocalDate and LocalDateTime object
		LocalDate d04 = LocalDate.parse("2024-02-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-02-22T18:00:00.50");
		
		//Parsing a ISO8601 text into a Instant object
		Instant d06 = Instant.parse("2024-02-22T18:00:00.50Z");
		//Parsing a ISO8601 text into a Instant object specifying the timezone of the time
		//The printed time object will be the Zulu-time based
		Instant d07 = Instant.parse("2024-02-22T18:00:00.50-03:00");
		
		//Instantiating a LocalDate object based on customized text
		//Using DateTimeFormatter class and .ofPattern function
		LocalDate d08 = LocalDate.parse("22/02/2024", formatter);
		LocalDateTime d09 = LocalDateTime.parse("22/02/2024 20:37", formatterTime);
		
		LocalDate d10 = LocalDate.of(2024, 2, 22);
		LocalDateTime d11 = LocalDateTime.of(2024, 2, 22, 20, 42);
		
		System.out.println("LocalDate = "+d01);
		System.out.println("LocalDateTime = "+d02);
		System.out.println("Instant = "+d03);
		System.out.println("LocalDate object based on ISO8601 text = "+d04);
		System.out.println("LocalDateTime object based on ISO8601 text = "+d05);
		System.out.println("Instant object based on ISO8601 text = "+d06);
		System.out.println("Instant object based on ISO8601 text and specified timezone = "+d07);
		System.out.println("LocalDate object based on customized text+formatter = "+d08);
		System.out.println("LocalDateTime object based on customized text+formatter = "+d09);
		System.out.println("LocalDate object based on variables = "+d10);
		System.out.println("LocalDateTime object based on variables = "+d11);
		
		sc.close();
	}
}