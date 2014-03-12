package org.tdd.kata1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dvornykv on 3/12/14.
 */
public class ShoppingCard{
    private List<IProduct> card=new ArrayList<IProduct>();

    public void add(IProduct product) {
        card.add(product);
    }

    public List<IProduct> getCard() {
        return card;
    }
}
