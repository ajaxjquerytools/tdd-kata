package org.tdd.kata1;

public class ProductBuilder {

   public static void buildPricingDict(){
        PricingDict pricingDict=PricingDict.getInstance();

        pricingDict.addProduct(new Product(ProductName.Table,ProductType.SIMPLE,350.5));
        pricingDict.addProduct(new Product(ProductName.Chair,ProductType.SIMPLE,515.10));
        pricingDict.addProduct(new Product(ProductName.Monitor,ProductType.SIMPLE,1025.65));
        pricingDict.addProduct(new Product(ProductName.Mouse,ProductType.SIMPLE,78.65));

        pricingDict.addProduct(new Product(ProductName.Marker,ProductType.THREE_FOR_A_DOLLAR,0.45));
        pricingDict.addProduct(new Product(ProductName.Pen,ProductType.THREE_FOR_A_DOLLAR,0.35));
        pricingDict.addProduct(new Product(ProductName.Pencil,ProductType.THREE_FOR_A_DOLLAR,0.40));


        pricingDict.addProduct(new Product(ProductName.Potato,ProductType.POUND,2.25));
        pricingDict.addProduct(new Product(ProductName.Tomato,ProductType.POUND,4.75));
        pricingDict.addProduct(new Product(ProductName.Banan,ProductType.POUND,8.54));
        pricingDict.addProduct(new Product(ProductName.Cucumber,ProductType.POUND,9.65));

        pricingDict.addProduct(new Product(ProductName.Socks,ProductType.BUY_TWO_GET_ONE,2.25));
        pricingDict.addProduct(new Product(ProductName.Trowsers,ProductType.BUY_TWO_GET_ONE,4.75));
        pricingDict.addProduct(new Product(ProductName.Glass,ProductType.BUY_TWO_GET_ONE,8.54));
        pricingDict.addProduct(new Product(ProductName.Cup,ProductType.BUY_TWO_GET_ONE,9.65));

    }
}
