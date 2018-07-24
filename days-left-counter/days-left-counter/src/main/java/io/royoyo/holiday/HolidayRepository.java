package io.royoyo.holiday;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HolidayRepository extends CrudRepository<Holiday, String> {
    List<Holiday> findByCustomerID(String customerID);
    List<Holiday> findByBookingID(String bookingID);

}
