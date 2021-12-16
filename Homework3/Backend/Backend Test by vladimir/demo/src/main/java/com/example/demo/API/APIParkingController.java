package com.example.demo.API;

import com.example.demo.Model.Parking;
import com.example.demo.Service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/parking")
public class APIParkingController
{
    private final ParkingService parkingService;

    @Autowired
    public APIParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping //getRequest znaci get
    public List<Parking> getAllParkings()
    {
        return parkingService.getAllParkings();
    }


//    @PutMapping(path = "{id}")
//    public void updatePersonByID(@PathVariable("id") UUID id,@RequestBody Person personToupdate)
//    {
//        personService.updatePersonByID(id,personToupdate);
//    }


    //ova e update na bazata ;)
    @PutMapping(path = "{id}")
    public void Decrement(@PathVariable("id") UUID id)
    {
         parkingService.Decrement(id);
    }
}