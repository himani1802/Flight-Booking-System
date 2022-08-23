package com.example.FlightBookingAdmin.controller;

import com.example.FlightBookingAdmin.entity.Airline;
import com.example.FlightBookingAdmin.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirlineController {

    @Autowired
    AirlineService airlineService;

    @PostMapping("/airline")
    public ResponseEntity<?> createAirline(@RequestBody Airline airline){
        return ResponseEntity.ok().body(this.airlineService.createAirline(airline));
    }

    @GetMapping("/getAllAirlines")
    public ResponseEntity<List<Airline>> getAll(){
        return ResponseEntity.ok().body(airlineService.getAllAirlines());
    }

    @GetMapping("/get/{airlineId}")
    public ResponseEntity<Airline> getAirlineById(@PathVariable long airlineId){
        return ResponseEntity.ok().body(airlineService.getAirlineById(airlineId));
    }

    @PutMapping("/edit/{airlineId}")
    public ResponseEntity<Airline> updateAirline(@PathVariable long airlineId,
                                                 @RequestBody Airline airline){
        return ResponseEntity.ok().body(this.airlineService.updateAirline(airline));
    }

    @DeleteMapping("delete/{airlineId}")
    public HttpStatus deleteAirline(@PathVariable long airlineId){
        this.airlineService.deleteAirline(airlineId);
        return HttpStatus.OK;
    }
}
