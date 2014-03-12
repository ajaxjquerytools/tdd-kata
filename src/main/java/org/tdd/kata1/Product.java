package org.tdd.kata1;

/**
 * Created by dvornykv on 3/12/14.
 */
public class Product implements IProduct {

    private ProductType type;
    private double price;

    public Product(ProductType type, double price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
