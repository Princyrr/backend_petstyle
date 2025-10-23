package com.petstyler.backend.repository;
import com.petstyler.backend.model.Booking;


import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {
    List<Booking> findByDateAndTime(String date, String time);
    List<Booking> findByDate(String date);  // <-- adiciona este
}
