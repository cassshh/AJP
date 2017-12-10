package com.casheep.minor.ajp.service;

import com.casheep.minor.ajp.model.ComponentItem;
import com.casheep.minor.ajp.model.Laptop;
import com.casheep.minor.ajp.model.LaptopComponent;
import com.casheep.minor.ajp.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public List<Laptop> getDemoLaptops() {
        return List.of(
                new Laptop(0,
                        "Apple Macintosh Original",
                        "Stealthy as a whale",
                        "apple_1.png",
                        2495L,
                        List.of(
                                new LaptopComponent("display",
                                        List.of(
                                                new ComponentItem(0L, "Latest 9\" Monochrome 512x324"),
                                                new ComponentItem(420L, "The future is now. 11\" Monochrome 768x512")
                                        )),
                                new LaptopComponent("cpu",
                                        List.of(
                                                new ComponentItem(0L, "8 MHz type 68000 to get the job done"),
                                                new ComponentItem(275L, "A spacetraveling 12MHz type i69")
                                        )),
                                new LaptopComponent("ram",
                                        List.of(
                                                new ComponentItem(0L, "128k of RAM to handle every job"),
                                                new ComponentItem(1337L, "Revolutionairy dedotated 512k wam fah teh hardcore gamers")
                                        ))
                        )),
                new Laptop(1,
                        "MS-DOS",
                        "For the intelligent living creatures",
                        "msdos_1.png",
                        175L,
                        List.of(
                                new LaptopComponent("display",
                                        List.of(
                                                new ComponentItem(0L, "Latest 13\" RGB 512x324"),
                                                new ComponentItem(32L, "The future is now. 15\" Monochrome 1366x768")
                                        )),
                                new LaptopComponent("cpu",
                                        List.of(
                                                new ComponentItem(0L, "80386-SX 16MHz processor"),
                                                new ComponentItem(10L, "Pentium class processor to rek erri apple")
                                        )),
                                new LaptopComponent("ram",
                                        List.of(
                                                new ComponentItem(0L, "4 MB of memory more than ur mac in 2010"),
                                                new ComponentItem(240L, "16 MB of memory than ur mac in 2100")
                                        ))
                        )),
                new Laptop(2,
                        "Linux",
                        "Ikea Hardware",
                        "linux_1.png",
                        95L,
                        List.of(
                                new LaptopComponent("display",
                                        List.of(
                                                new ComponentItem(0L, "720p 240 degree"),
                                                new ComponentItem(15L, "1080p 60fps memes")
                                        )),
                                new LaptopComponent("cpu",
                                        List.of(
                                                new ComponentItem(0L, "Pls install urself"),
                                                new ComponentItem(48L, "i9 Nuclear reactor")
                                        )),
                                new LaptopComponent("ram",
                                        List.of(
                                                new ComponentItem(0L, "Do u even ram bro"),
                                                new ComponentItem(128L, "Ramasaur")
                                        ))
                        ))
        );
    }

    @Override
    public void add(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    @Override
    public void add(Collection<Laptop> laptops) {
        laptopRepository.saveAll(laptops);
    }

    @Override
    public List<Laptop> getLaptops() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop getLaptop(Long id) {
        return laptopRepository.findById(id).orElse(null);
    }
}
