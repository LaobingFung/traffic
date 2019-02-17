package main.java.fung.model;

public abstract class Transportation {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isAvaliable(double cost);
}
