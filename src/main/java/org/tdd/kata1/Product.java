package org.tdd.kata1;

/**
 * Created by dvornykv on 3/12/14.
 */
public class Product implements IProduct {
    private ProductName name;
    private ProductType type;
    private double price;

    public Product(ProductName name,ProductType type, double price) {
        this.name=name;
        this.type = type;
        this.price = price;
        System.out.println("master commit 1");
        System.out.println("master commit 2");
        System.out.println("master commit 3");

        System.out.println("master COMMIT 1");
        System.out.println("master COMMIT 2");
        System.out.println("master COMMIT 3");
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public ProductName getName() {
        return name;
    }

}
