package io.royoyo.holiday;

import java.util.Date;


public class Holiday {
	private String bookingID;
	private String customerID;
	private String description;
	private Date bookingDate;
	private Date checkinDate;
	private String timeLeft;
	public String getBookingID() {
		return bookingID;
	}
	
	
	public Holiday(String bookingID, String customerID, String description, Date checkinDate) {
		this.bookingID = bookingID;
		this.customerID = customerID;
		this.description = description;
		this.checkinDate = checkinDate;
		this.bookingDate = new Date();
	}


	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate() {
		this.bookingDate = new Date();
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	@Override
	public String toString() {
		return "Holiday [bookingID=" + bookingID + ", customerID=" + customerID + ", description=" + description +", "
				+System.lineSeparator()+ "bookingDate=" + bookingDate + ", checkinDate=" + checkinDate + "]";
	}
	
	/*
	public String timeLeft() {
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date d1 = checkinDate;
		Date d2 = new Date();
		
		long diff = d1.getTime() - d2.getTime();

		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		//long diffMonths = diff / (30 * 24 * 60 * 60 * 1000) % 31;

		String timeLeft = (diffDays + " days, ")+ (diffHours + " hours, ")+(diffMinutes + " minutes, ")+(diffSeconds +
						" seconds left to go for your Total Holiday!"+System.lineSeparator()+"Here are the details: "+this.toString());
		return timeLeft;
		
		
	}
	*/


	public String getTimeLeft() {
		Date d1 = checkinDate;
		Date d2 = new Date();
		
		long diff = d1.getTime() - d2.getTime();

		long diffSeconds = diff / 1000;
		//long diffMinutes = diff / (60 * 1000) % 60;
		//long diffHours = diff / (60 * 60 * 1000) % 24;
		//long diffDays = diff / (24 * 60 * 60 * 1000);
		//long diffMonths = diff / (30 * 24 * 60 * 60 * 1000) % 31;
		
		timeLeft = diffSeconds+" seconds";

		//String timeLeft = (diffDays + " days, ")+ (diffHours + " hours, ")+(diffMinutes + " minutes, ")+(diffSeconds +
		//				" seconds left to go for your Total Holiday!");
				//+ System.lineSeparator() +"Here are the details: "+this.toString());
		return timeLeft;
	}


	//public void setTimeLeft(String timeLeft) {
	//	this.timeLeft = timeLeft;
	//}
	

}
