package org.tdd.kata1;

import java.text.DecimalFormat;

/**
 * Created by dvornykv on 3/12/14.
 */
public class PriceStrategy {
    public static double calculatePrice(ShoppingCard card) {
        double sum = 0;

        for (ProductName productName : card.getProducts()) {
            Product product = PricingDict.getInstance().getProduct(productName);
            double price = product.getPrice();
            double count = card.getProductCount(productName);
            ProductType productType = product.getType();
            switch (productType) {
                case THREE_FOR_A_DOLLAR:
                    sum += calcThreForADollar(price, count);
                    break;
                case BUY_TWO_GET_ONE:
                    sum += calcBuyTwoGetOne(price, count);
                    break;
                case POUND:
                    sum += calcPound(price, count);
                    break;
                default:
                    sum += calcSimple(price, count);
            }

        }
        DecimalFormat threeDForm = new DecimalFormat("#.###");
        return Double.valueOf(threeDForm.format(sum));
    }

    public static double calcSimple(double price, double count) {
        return price * count;
    }

    public static double calcThreForADollar(double price, double count) {
        int dollars = (int) count / 3;
        double left = count - dollars * 3;
        return dollars + left * price;
    }

    public static double calcPound(double price, double count) {
        return price * count;
    }

    public static double calcBuyTwoGetOne(double price, double count) {
        double total = 0;
        int i = 1;
        while (i <= count) {
            if (i % 3 != 0) {
                total += price;
            }
            ++i;
        }
        return total;
    }
}
