package com.casheep.minor.ajp.service;

import com.casheep.minor.ajp.model.Laptop;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LaptopService {

    void add(Laptop laptop);

    void add(Collection<Laptop> laptops);

    List<Laptop> getLaptops();

    Laptop getLaptop(Long id);

    public List<Laptop> getDemoLaptops();
}
