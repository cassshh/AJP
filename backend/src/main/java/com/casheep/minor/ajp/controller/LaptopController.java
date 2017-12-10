package com.casheep.minor.ajp.controller;

import com.casheep.minor.ajp.model.Laptop;
import com.casheep.minor.ajp.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class LaptopController {

    @Autowired
    LaptopService laptopServiceImpl;

    @RequestMapping(value = "laptops", method = RequestMethod.GET)
    public ResponseEntity<List<Laptop>> listLaptops() {
        List<Laptop> laptops = laptopServiceImpl.getLaptops();
        return new ResponseEntity<>(laptops, HttpStatus.OK);
    }

    @RequestMapping(value = "laptops/{id}", method = RequestMethod.GET)
    public ResponseEntity<Laptop> listLaptop(@PathVariable long id) {
        Laptop laptop = laptopServiceImpl.getLaptop(id);
        if (laptop == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(laptop, HttpStatus.OK);
    }

    @RequestMapping(value = "laptops/init")
    public ResponseEntity<?> init() {
        laptopServiceImpl.add(laptopServiceImpl.getDemoLaptops());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
