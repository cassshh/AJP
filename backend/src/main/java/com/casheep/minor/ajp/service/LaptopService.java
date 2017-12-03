package com.casheep.minor.ajp.service;

import com.casheep.minor.ajp.model.Laptop;
import com.casheep.minor.ajp.model.LaptopComponent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("laptopService")
public class LaptopService implements ILaptopService {

    public List<Laptop> getLaptops() {
        return null;
    }

    public Laptop getLaptop(long id) {
        return null;
    }

    public List<LaptopComponent> getLaptopComponents(long id) {
        return null;
    }

}
