package io.royoyo.holiday;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "holiday")
public class Holiday implements Serializable{
	//private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private long id;
	@Column(name = "BOOKINGID")
	private String bookingID;
	@Column(name = "CUSTOMERID")
	private String customerID;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "BOOKINGDATE")
	private String bookingDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());;
	@Column(name = "CHECKINDATE")
	private String checkinDate;
	@Column(name = "TIMELEFT")
	private String timeLeft;
	
  public Holiday(){
  }
	
	public Holiday(String bookingID, String customerID, String description, String checkinDate) {
		this.bookingID = bookingID;
		this.customerID = customerID;
		this.description = description;
		this.checkinDate = checkinDate;
		this.bookingDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());;
		this.timeLeft = getTimeLeft();
	}

	public String getBookingID() {
		return bookingID;
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
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate() {
		this.bookingDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	@Override
	public String toString() {
		return "Holiday [bookingID=" + bookingID + ", customerID=" + customerID + ", description=" + description +", "
				+System.lineSeparator()+ "bookingDate=" + bookingDate + ", checkinDate=" + checkinDate + "]";
	}
	
	public String getTimeLeft() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		//Date d1 = checkinDate;
		Date d1 = new Date();
		try {
			d1 = simpleDateFormat.parse(checkinDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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
		//				+ System.lineSeparator() +"Here are the details: "+this.toString());
		return timeLeft;
	}

}
