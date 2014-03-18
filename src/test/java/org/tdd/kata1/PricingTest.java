package org.tdd.kata1;

import org.junit.Assert;
import org.junit.Test;


public class PricingTest {
    @Test
    public void shouldGetPriceForSimpleProduct() {

        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Table, 1.0);
        card.add(ProductName.Table, 1.0);

        Assert.assertEquals(701, PriceStrategy.calculatePrice(card), 0);
    }

    @Test
    public void shouldCalculateCorretPriceForSimpleProducts() {
        ShoppingCard card=new ShoppingCard();
        card.add(ProductName.Table, 1.0);
        card.add(ProductName.Chair, 2.0);
        card.add(ProductName.Monitor, 3.0);
        card.add(ProductName.Mouse, 1.0);


        Assert.assertEquals(4536.3, PriceStrategy.calculatePrice(card),0);
    }

    @Test
    public void shouldBeZeroPriceWhenNoProductsInTheStock() {
        ShoppingCard card = new ShoppingCard();
        Assert.assertEquals(0, PriceStrategy.calculatePrice(card), 0);
    }
}
