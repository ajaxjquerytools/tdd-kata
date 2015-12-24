package org.tdd.kata1;

/**
 * Created by dvornykv on 3/12/14.
 */
public class PriceRule {
    public PriceRule(){
        System.out.println("Public constructor");
    }

    static {
        System.out.println("This is static block");
    }
    public PriceRule(){
        System.out.println("Public constructor");
    }
}
