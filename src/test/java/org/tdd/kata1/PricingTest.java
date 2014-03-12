package org.tdd.kata1;

import org.junit.Assert;
import org.junit.Test;


public class PricingTest {
    @Test
    public void shouldGetPriceForSimpleProduct(){

        ShoppingCard card=new ShoppingCard();
        card.add(new SimpleProduct(125));

        Assert.assertEquals(125.0, PriceStrategy.calculatePrice(card),0);
    }
}
