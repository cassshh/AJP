package com.casheep.minor.ajp.model;

public class ComponentItem {

    private long price;
    private String label;

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
