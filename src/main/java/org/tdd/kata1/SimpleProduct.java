package org.tdd.kata1;


public class SimpleProduct implements IProduct{
    public double price;
    public SimpleProduct(double price) {
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
}
