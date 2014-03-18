package org.tdd.kata1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by dvornykv on 3/12/14.
 */
public class ShoppingCard {

    private Map<ProductName, Double> card = new HashMap<ProductName, Double>();

    public void add(ProductName productName, Double count) {
        if (card.containsKey(productName)) {
            Double currentCount = card.get(productName);
            card.put(productName, currentCount + count);

        } else {
            card.put(productName, count);
        }

    }

    public Set<ProductName> getProducts() {
        return card.keySet();
    }

    public double getProductCount(ProductName productName) {
        return card.get(productName);
    }



}
