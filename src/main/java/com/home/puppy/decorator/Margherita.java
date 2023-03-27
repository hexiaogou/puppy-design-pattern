package com.home.puppy.decorator;

/**
 * Margherita
 *
 * @author hexiaogou
 * @desc margherita
 * @date 2023-03-27 19:25
 */
public class Margherita implements Pizza {
    @Override
    public String getDesc() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 5.99;
    }
}
