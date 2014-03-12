package org.tdd.kata1;

/**
 * Created by dvornykv on 3/12/14.
 */
public class PriceStrategy {
    public static double calculatePrice(ShoppingCard card) {
        double sum=0;
        for(IProduct product:card.getCard()){
            sum+=product.getPrice();
        }
        return sum;
    }
}
