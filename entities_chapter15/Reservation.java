package entities_chapter15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer roomNumber;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	
	public Reservation() {	
	}
	public Reservation(Integer inputRoomNumber, LocalDate inputCheckin, LocalDate inputCheckout) {
		this.roomNumber = inputRoomNumber;
		this.checkinDate = inputCheckin;
		this.checkoutDate = inputCheckout;
	}
	public void setRoomNumber(Integer inputRoomNumber) {
		this.roomNumber = inputRoomNumber;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public String getCheckin() {
		return checkinDate.format(formatter).toString();
	}
	public String getCheckout() {
		return checkoutDate.format(formatter).toString();
	}
	public Integer duration() {
		return checkoutDate.getDayOfYear() - checkinDate.getDayOfYear();
	}
	public void updateDates(LocalDate inputCheckin, LocalDate inputCheckout) {
		 this.checkinDate = inputCheckin;
		 this.checkoutDate = inputCheckout;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(" check-in: ");
		sb.append(checkinDate.format(formatter));
		sb.append(", check-out: ");
		sb.append(checkoutDate.format(formatter));
		sb.append(duration()+" nights");
		return sb.toString();
	}
}
