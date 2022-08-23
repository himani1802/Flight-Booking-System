package com.example.FlightBookingAdmin.serviceImpl;

import com.example.FlightBookingAdmin.entity.Airline;
import com.example.FlightBookingAdmin.exception.ResourceNotFoundException;
import com.example.FlightBookingAdmin.repository.AirlineRepository;
import com.example.FlightBookingAdmin.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineServiceImpl implements AirlineService {
    @Autowired
    AirlineRepository airlineRepository;

    @Override
    public Airline getAirlineById(long airlineId) {
        Optional<Airline> airline = this.airlineRepository.findById(airlineId);
        if(airline.isPresent()){
            return airline.get();
        }else {
            throw new ResourceNotFoundException("Airline not found :"+airlineId);
        }
    }

    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    @Override
    public Airline createAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    @Override
    public Airline updateAirline(Airline airline) {
        Optional<Airline> edit=this.airlineRepository.findById(airline.getId());
        if(edit.isPresent()) {
            Airline editAirline = edit.get();
            editAirline.setId(airline.getId());
            editAirline.setAirlineName(airline.getAirlineName());
            editAirline.setFromPlace(airline.getFromPlace());
            editAirline.setToPlace(airline.getToPlace());
            editAirline.setPrice(airline.getPrice());
            airlineRepository.save(editAirline);
            return editAirline;
        } else {
            throw new ResourceNotFoundException("Airline not found :"+airline.getId());
        }
    }

    @Override
    public void deleteAirline(long airlineId) {
        Optional<Airline> airline= this.airlineRepository.findById(airlineId);
        if(airline.isPresent()) {
            this.airlineRepository.delete(airline.get());
        } else {
            throw new ResourceNotFoundException("Airline not found :"+airlineId);
        }
    }
}
