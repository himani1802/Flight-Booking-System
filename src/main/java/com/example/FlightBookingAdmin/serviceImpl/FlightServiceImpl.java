package com.example.FlightBookingAdmin.serviceImpl;

import com.example.FlightBookingAdmin.entity.Flight;
import com.example.FlightBookingAdmin.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Override
    public Flight getFlightById(long id) {
        return null;
    }

    @Override
    public List<Flight> getAllFlight() {
        return null;
    }

    @Override
    public Flight addFlight(Flight flightId) {
        return null;
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return null;
    }

    @Override
    public void blockFlight(long flightId) {

    }
}
