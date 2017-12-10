package com.casheep.minor.ajp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ComponentItems")
public class ComponentItem implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long price;
    private String label;

    @ManyToOne
    private LaptopComponent component;

    public ComponentItem() {
    }

    public ComponentItem(long price, String label) {
        this.price = price;
        this.label = label;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
