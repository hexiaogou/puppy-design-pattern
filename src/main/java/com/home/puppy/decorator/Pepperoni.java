package com.home.puppy.decorator;

/**
 * Pepperoni
 *
 * @author hexiaogou
 * @desc pepperoni
 * @date 2023-03-27 19:30
 */
public class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
