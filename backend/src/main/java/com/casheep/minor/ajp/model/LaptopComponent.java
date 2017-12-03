package com.casheep.minor.ajp.model;

import java.util.List;

public class LaptopComponent {

    private String name;
    private List<ComponentItem> items;

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
