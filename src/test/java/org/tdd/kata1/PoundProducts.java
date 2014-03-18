package org.tdd.kata1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dvornykv on 3/12/14.
 */
public class PoundProducts {
    @Test
    public void shouldCalcCorrectForPotato(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Potato, 12.54);
        Assert.assertEquals(28.215, PriceStrategy.calculatePrice(card),0.001);
    }

    @Test
    public void shouldCalcAllPoundProductCorrect(){
        ShoppingCard card = new ShoppingCard();
        card.add(ProductName.Potato, 12.54);
        card.add(ProductName.Tomato, 10.0);
        card.add(ProductName.Banan, 5.54);
        card.add(ProductName.Cucumber, 3.25);


        Assert.assertEquals(154.3891, PriceStrategy.calculatePrice(card),0.001);
    }
}
