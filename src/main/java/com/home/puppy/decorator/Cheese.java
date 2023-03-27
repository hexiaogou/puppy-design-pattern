package com.home.puppy.decorator;

/**
 * Cheese
 *
 * @author hexiaogou
 * @desc cheese
 * @date 2023-03-27 19:28
 */
public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}
