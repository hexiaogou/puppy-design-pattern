package com.home.puppy.decorator;

/**
 * ToppingDecorator
 *
 * @author hexiaogou
 * @desc topping decorator
 * @date 2023-03-27 19:26
 */
public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
