package com.example.FlightBookingAdmin.service;

import com.example.FlightBookingAdmin.entity.Airline;
import com.example.FlightBookingAdmin.entity.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlightService {
    Flight getFlightById(long id);
    List<Flight> getAllFlight();
    Flight addFlight(Flight flightId);
    Flight updateFlight(Flight flight);
    void blockFlight(long flightId);
}
