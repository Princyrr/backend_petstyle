package com.petstyler.backend.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;
    private String petName;
    private String petType;
    private String tutorName;
    private String phone;
    private String email;
    private List<String> services;
    private String date; // "YYYY-MM-DD"
    private String time; // "HH:MM"
    private String observations;
    private String status; // Pendente, Confirmado, Cancelado

    public Booking() {}

    public Booking(String petName, String petType, String tutorName, String phone, String email,
                   List<String> services, String date, String time, String observations, String status) {
        this.petName = petName;
        this.petType = petType;
        this.tutorName = tutorName;
        this.phone = phone;
        this.email = email;
        this.services = services;
        this.date = date;
        this.time = time;
        this.observations = observations;
        this.status = status;
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getPetName() { return petName; }
    public void setPetName(String petName) { this.petName = petName; }
    public String getPetType() { return petType; }
    public void setPetType(String petType) { this.petType = petType; }
    public String getTutorName() { return tutorName; }
    public void setTutorName(String tutorName) { this.tutorName = tutorName; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<String> getServices() { return services; }
    public void setServices(List<String> services) { this.services = services; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getObservations() { return observations; }
    public void setObservations(String observations) { this.observations = observations; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
