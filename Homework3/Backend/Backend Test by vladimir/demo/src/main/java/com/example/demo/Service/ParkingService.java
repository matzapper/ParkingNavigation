
package com.example.demo.Service;

import com.example.demo.Dao.InterfaceOfDatabase;

import com.example.demo.Model.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ParkingService {
    private final InterfaceOfDatabase parkingDAO; //od service povikuva eve Database ili DAO

    @Autowired
    public ParkingService(@Qualifier("Database") InterfaceOfDatabase parkingDAO) {
        this.parkingDAO = parkingDAO;
    }

    public List<Parking> getAllParkings()
    {
        return parkingDAO.selectAllParkings();
    }
    public void Decrement(UUID id)
    {
         parkingDAO.Decrement(id);
    }
}