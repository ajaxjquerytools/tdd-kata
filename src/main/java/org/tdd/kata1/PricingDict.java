package org.tdd.kata1;

import java.util.HashMap;
import java.util.Map;

public class PricingDict {
    private static PricingDict pricingDict;
    private Map<ProductName, Product> pricingMap = new HashMap<ProductName, Product>();

    static {
        ProductBuilder.buildPricingDict();
    }

    public static PricingDict getInstance() {
        if (pricingDict == null) {
            pricingDict = new PricingDict();
        }
        return pricingDict;
    }

    public PricingDict addProduct(Product product) {
        if (!pricingMap.containsKey(product.getName())) {
            pricingMap.put(product.getName(), product);
        }
        return this;
    }

    public Product getProduct(ProductName productName) {
        return pricingMap.get(productName);
    }

}
