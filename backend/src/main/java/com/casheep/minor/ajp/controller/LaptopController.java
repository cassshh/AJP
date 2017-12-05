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
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @RequestMapping(value = "/laptop", method = RequestMethod.GET)
    public ResponseEntity<List<Laptop>> listLaptops() {
        List<Laptop> laptops = laptopService.getLaptops();
        return new ResponseEntity<List<Laptop>>(laptops, HttpStatus.OK);
    }

    @RequestMapping(value = "/laptop/{id}", method = RequestMethod.GET)
    public ResponseEntity<Laptop> listLaptop(@PathVariable long id) {
        Laptop laptop = laptopService.getLaptop(id);
        if (laptop == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(laptop, HttpStatus.OK);
    }

}
