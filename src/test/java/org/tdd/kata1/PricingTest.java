package org.tdd.kata1;

import org.junit.Assert;
import org.junit.Test;


public class PricingTest {
    @Test
    public void shouldGetPriceForSimpleProduct(){

        ShoppingCard card=new ShoppingCard();
        card.add(new Product(ProductType.SIMPLE,125));
        Assert.assertEquals(125.0, PriceStrategy.calculatePrice(card),0);
    }

    @Test
    public void shouldCalculateCorretPriceForSimpleProducts(){
        ShoppingCard card=new ShoppingCard();
        card.add(new Product(ProductType.SIMPLE,125));
        card.add(new Product(ProductType.SIMPLE,129.89));
        card.add(new Product(ProductType.SIMPLE,235.89));
        card.add(new Product(ProductType.SIMPLE,1.05));
        card.add(new Product(ProductType.SIMPLE,0.99));

        Assert.assertEquals(492.82, PriceStrategy.calculatePrice(card),0);
    }

    @Test
    public void shouldBeZeroPriceWhenNoProductsInTheStock(){
        ShoppingCard card=new ShoppingCard();
        Assert.assertEquals(0, PriceStrategy.calculatePrice(card),0);
    }
}
