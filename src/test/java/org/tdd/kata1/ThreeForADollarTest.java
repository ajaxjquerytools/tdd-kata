package org.tdd.kata1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dvornykv on 3/12/14.
 */
public class ThreeForADollarTest {
    @Test
    public void shouldCalcTreeForADollar(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Marker, 3.0);

        Assert.assertEquals(1.0, PriceStrategy.calculatePrice(card), 0);
    }

    @Test
    public void shouldCalcPriceTreeForADollarWhenMoreProductsThanThree(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Marker, 5.0);

        Assert.assertEquals(1.9, PriceStrategy.calculatePrice(card), 0);
    }

    @Test
    public void shouldCalcCorrectWhenMoreThan21Products(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Marker, 10.0);
        card.add(ProductName.Marker, 10.0);
        card.add(ProductName.Marker, 5.0);

        Assert.assertEquals(8.45, PriceStrategy.calculatePrice(card), 0);
    }

    @Test
    public void shouldCalcZeroWhenNoProducts(){
        ShoppingCard card = new ShoppingCard();
        Assert.assertEquals(0, PriceStrategy.calculatePrice(card), 0);
    }

    @Test
    public void shouldCalcMultipleProductWithCorrectPrice(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Marker, 9.0);
        card.add(ProductName.Pencil, 5.0);
        card.add(ProductName.Pen, 7.0);

        Assert.assertEquals(7.15, PriceStrategy.calculatePrice(card), 0);
    }

}
