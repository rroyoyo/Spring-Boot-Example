package io.royoyo.holiday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class HolidayService {
	
	@SuppressWarnings("deprecation")
	List<Holiday> holidays = new ArrayList<>(Arrays.asList(new Holiday("booking101", "customer101", "Incredible India", new Date(118, 6, 25))));
	
	public List<Holiday> getAllHolidays(){
		 return holidays;
	 }
	
	public Holiday getHoliday(String bId) {
		 return holidays.stream().filter(h -> h.getBookingID().equals(bId)).findFirst().get();
	 }
	
	 public void addHoliday(Holiday holiday) {
		 holidays.add(holiday);
	 }
	 
	 public void updateHoliday(String bid, Holiday holiday) {
			for (int i = 0; i< holidays.size(); i++) {
				Holiday t = holidays.get(i);
				if(t.getBookingID().equals(bid)) {
					holidays.set(i, holiday);
					return;
					//return "Updated Successfully";
				}
			}
			//return "Couldn't update, created new Holiday instead";
		}
	 
	 public void deleteHoliday(String bid) {
			holidays.removeIf(t -> t.getBookingID().equals(bid));
			
		}	 
	 
}

