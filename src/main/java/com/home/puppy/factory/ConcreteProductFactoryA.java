package com.home.puppy.factory;

/**
 * ConcreteProductFactoryA
 *
 * @author hexiaogou
 * @desc concrete product factory A
 * @date 2023-03-27 17:07
 */
public class ConcreteProductFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
