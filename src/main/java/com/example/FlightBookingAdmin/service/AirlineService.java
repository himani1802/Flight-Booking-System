package com.example.FlightBookingAdmin.service;

import com.example.FlightBookingAdmin.entity.Airline;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AirlineService {

     Airline getAirlineById(long id);
     List<Airline> getAllAirlines();
     Airline createAirline(Airline airline);
     Airline updateAirline(Airline airline);
     void deleteAirline(long airlineId);


}
