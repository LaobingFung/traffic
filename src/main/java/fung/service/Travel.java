package main.java.fung.service;

import main.java.fung.model.Transportation;

public class Travel {
    private Transportation transportation;

    public Travel(Transportation transportation) {
        this.transportation = transportation;
    }

    public boolean isavailability(double cost) {
        return this.transportation.isAvaliable(cost);
    }
}
