package entities_chapter15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import chapter15.exceptions.DomainException;

public class Reservation {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer roomNumber;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	
	public Reservation() {	
	}
	public Reservation(Integer inputRoomNumber, LocalDate inputCheckin, LocalDate inputCheckout) throws DomainException {
		if (!inputCheckout.isAfter(inputCheckin)) {
			//return "Error in update: check-out date must be after check-in.";
			throw new DomainException("Error in update: check-out date must be after check-in.");
		}
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
	public void updateDates(LocalDate inputCheckin, LocalDate inputCheckout) throws DomainException {
		LocalDate now = LocalDate.now();
		if (inputCheckin.isAfter(now)&&inputCheckout.isAfter(now)) {
			if (!inputCheckout.isAfter(inputCheckin)) {
				//return "Error in update: check-out date must be after check-in.";
				throw new DomainException("Error in update: check-out date must be after check-in.");
			}
			else {
				this.checkinDate = inputCheckin;
				this.checkoutDate = inputCheckout;
				//return null;
			}
		}
		else {
			//return "Error in update: Dates for update must be at future.";
			throw new DomainException("Error in update: Dates for update must be at future.");
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(", check-in: ");
		sb.append(checkinDate.format(formatter));
		sb.append(", check-out: ");
		sb.append(checkoutDate.format(formatter));
		sb.append(" "+duration()+" nights");
		return sb.toString();
	}
}
