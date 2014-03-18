package org.tdd.kata1;


import org.junit.Assert;
import org.junit.Test;

public class BuyTwoGetOneTest {
    @Test
    public void shouldCalcProductCorrect(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Socks, 3.0);
        Assert.assertEquals(4.5, PriceStrategy.calculatePrice(card), 0.001);
    }

    @Test
    public void shouldCalcMultipleProductCorrect(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Socks, 3.0);
        card.add(ProductName.Trowsers, 4.0);
        Assert.assertEquals(18.75, PriceStrategy.calculatePrice(card), 0.001);
    }
}
