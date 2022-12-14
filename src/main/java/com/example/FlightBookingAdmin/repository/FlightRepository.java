package com.example.FlightBookingAdmin.repository;

import com.example.FlightBookingAdmin.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
