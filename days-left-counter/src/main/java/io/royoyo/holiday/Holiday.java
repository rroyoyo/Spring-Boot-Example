package io.royoyo.holiday;

import java.util.Date;


public class Holiday {
	private String bookingID;
	private String customerID;
	private String description;
	private Date bookingDate;
	private Date checkinDate;
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
	
	public String timeLeft() {
		
		//SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date d1 = checkinDate;
		Date d2 = new Date();
		
		long diff = d1.getTime() - d2.getTime();

		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);

		String result = (diffDays + " days, ")+ (diffHours + " hours, ")+(diffMinutes + " minutes, ")+(diffSeconds +
						" seconds left to go for your Total Holiday!"+System.lineSeparator()+"Here are the details: "+this.toString());
		return result;
		
		
	}
	 /*

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {

	public static void main(String[] args) {

		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
	  */

	

}
