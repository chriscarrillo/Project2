package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

public class Controller {

    @Autowired
    private VehicleDao vehicleDao;

    @RequestMapping(value="/addVehicle", method= RequestMethod.POST)
    public Vehicle addVehicle(@RequestBody Vehicle newVehicle) throws IOException {
        return null;
    }

    @RequestMapping(value="/getVehicle/{id}", method=RequestMethod.GET)
    public Vehicle getVehicle(@PathVariable("id") int id) throws IOException {
        return vehicleDao.getById(id);
    }

    @RequestMapping(value = "/updateVehicle", method = RequestMethod.PUT)
    public Vehicle updateVehicle(@RequestBody Vehicle newVehicle) throws IOException {
        return null;
    }

    @RequestMapping(value = "/deleteVehicle", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteVehicle(@PathVariable("id") int id) throws IOException {
        return null;
    }

    @RequestMapping(value = "/getLatestVehicles", method = RequestMethod.GET)
    public List<Vehicle> getLatestVehicles() throws IOException {
        return null;
    }
}
