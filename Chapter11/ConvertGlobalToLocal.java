package chapter11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertGlobalToLocal{
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2024-02-24");
		LocalDateTime d02 = LocalDateTime.parse("2024-02-24T23:19:00.5");
		Instant d03 = Instant.parse("2024-02-24T01:02:03Z");
		LocalDate d04 = LocalDate.now();
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.now();
		
		//get all zoneids avaliable
		//for (String string : ZoneId.getAvailableZoneIds()) {
			//System.out.println(string);
		//}
		
		//converts the Instant object to a LocalDate object based on the systems default / user timezone
		System.out.println(d06);
		LocalDateTime converted = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(converted);
	
		
		Duration d07 = Duration.between(d05, d02);
		System.out.println(d07);
	}
}