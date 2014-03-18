package org.tdd.kata1;


import org.junit.Assert;
import org.junit.Test;

public class ComplexPriceTest {

    @Test
    public void shouldCalcMultipleProductType(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Socks, 3.0);

        card.add(ProductName.Potato, 12.54);
        card.add(ProductName.Tomato, 10.0);
        card.add(ProductName.Banan, 5.54);
        card.add(ProductName.Cucumber, 3.25);

        card.add(ProductName.Table, 1.0);
        card.add(ProductName.Chair, 2.0);
        card.add(ProductName.Monitor, 3.0);
        card.add(ProductName.Mouse, 1.0);

        card.add(ProductName.Marker, 9.0);
        card.add(ProductName.Pencil, 5.0);
        card.add(ProductName.Pen, 7.0);

        Assert.assertEquals(4702.3391, PriceStrategy.calculatePrice(card), 0.001);
    }
}
