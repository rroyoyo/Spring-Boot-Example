package io.royoyo.holiday;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HolidayService {
	
	@Autowired
	private HolidayRepository holidayRepository;
	
	//@SuppressWarnings("deprecation")
	//List<Holiday> holidays = new ArrayList<>(Arrays.asList(new Holiday("booking101", "customer101", "Incredible India", new Date(118, 6, 25))));
	
	//public List<Holiday> getAllHolidays(){
	//	 return holidays;
	//}
	
	public List<Holiday> getAllHolidays(){
		@SuppressWarnings("deprecation")
		List<Holiday> holidays = new ArrayList<>();
		//(Arrays.asList(new Holiday("booking101", "customer101", "Incredible India", "2018-08-08")));
		holidayRepository.findAll().forEach(holidays::add);
		return holidays;
	 }
	
	public Optional<Holiday> getHoliday(String id) {
		 return holidayRepository.findById(String.valueOf(id));
	 }

	public List<Holiday> getHolidaysByCustomerID(String id) {
		return holidayRepository.findByCustomerID(id);
	}

	public List<Holiday> getHolidaysByBookingID(String id) {
		return holidayRepository.findByBookingID(id);
	}

	public void addHoliday(Holiday holiday) {
		 holidayRepository.save(holiday);
	 }

	public void updateHoliday(String id, Holiday holiday) {
		holidayRepository.save(holiday);
	}
	
	 public void deleteHoliday(String bid) {
			holidayRepository.deleteById(String.valueOf(bid));
	}	 
	 
	 
}

