package com.petstyler.backend.controller;

import com.petstyler.backend.model.Booking;
import com.petstyler.backend.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Permitir frontend em outra porta
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    // Buscar todos
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Buscar por data (para bloquear horários)
    @GetMapping("/date/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date) {
        return bookingRepository.findByDate(date);
    }

    // Criar novo agendamento
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        booking.setStatus("Pendente");
        return bookingRepository.save(booking);
    }

    // Atualizar status
    @PutMapping("/{id}")
    public Booking updateBookingStatus(@PathVariable String id, @RequestBody Booking updatedBooking) {
        Booking booking = bookingRepository.findById(id).orElseThrow();
        booking.setStatus(updatedBooking.getStatus());
        return bookingRepository.save(booking);
    }

    // Deletar (opcional)
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable String id) {
        bookingRepository.deleteById(id);
    }
}
