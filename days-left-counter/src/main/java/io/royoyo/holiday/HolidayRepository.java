package io.royoyo.holiday;

import org.springframework.data.repository.CrudRepository;

public interface HolidayRepository extends CrudRepository<Holiday, String> {
	
}
