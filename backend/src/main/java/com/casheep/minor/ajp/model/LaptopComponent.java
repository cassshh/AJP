package com.casheep.minor.ajp.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "LaptopComponents")
public class LaptopComponent implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "component_id")
    private List<ComponentItem> items;

    @ManyToOne
    private Laptop laptop;

    public LaptopComponent() {
    }

    public LaptopComponent(String name, List<ComponentItem> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ComponentItem> getItems() {
        return items;
    }

    public void setItems(List<ComponentItem> items) {
        this.items = items;
    }
}
