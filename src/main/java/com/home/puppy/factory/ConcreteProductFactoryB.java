package com.home.puppy.factory;

/**
 * ConcreteProductFactoryB
 *
 * @author hexiaogou
 * @desc concrete product factory B
 * @date 2023-03-27 17:08
 */
public class ConcreteProductFactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
