package io.royoyo.holiday;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HolidayController {
	
	@Autowired
	private HolidayService holidayService;
	
	@RequestMapping("/holidays")
	public List<Holiday> getAllHolidays() {
		return holidayService.getAllHolidays();
	}
	
	@RequestMapping("/holidays/{id}")
	public Optional<Holiday> getHoliday(@PathVariable String id) {
		return holidayService.getHoliday(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/holidays")
	public void addHoliday(@RequestBody Holiday holiday) {
		holidayService.addHoliday(holiday);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/holidays/{id}")
	public void updateTopic(@RequestBody Holiday holiday, @PathVariable String id) {
		holidayService.updateHoliday(id, holiday);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/holidays/{id}")
	public void deleteTopic(@PathVariable String id) {
		holidayService.deleteHoliday(id);
	}
	
}
	

