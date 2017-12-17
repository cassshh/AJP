package com.casheep.minor.ajp.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Laptops")
public class Laptop implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private long price;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "laptop_id")
    private List<LaptopComponent> components;

    public Laptop() {
    }

    public Laptop(String name, String description, String image, long price, List<LaptopComponent> components) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.components = components;
    }

    public Laptop(long id, String name, String description, String image, long price, List<LaptopComponent> components) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.components = components;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public List<LaptopComponent> getComponents() {
        return components;
    }

    public void setComponents(List<LaptopComponent> components) {
        this.components = components;
    }
}
