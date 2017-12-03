package com.casheep.minor.ajp.service;

import com.casheep.minor.ajp.model.Laptop;
import com.casheep.minor.ajp.model.LaptopComponent;

import java.util.List;

public interface ILaptopService {

    List<Laptop> getLaptops();

    Laptop getLaptop(long id);

    List<LaptopComponent> getLaptopComponents(long id);

}
