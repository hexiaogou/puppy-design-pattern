package com.home.puppy.factory;

import org.junit.jupiter.api.Test;

/**
 * ProductFactoryTest
 *
 * @author hexiaogou
 * @desc product factory test
 * @date 2023-03-27 17:09
 */
public class ProductConcreteFactoryTest {
    @Test
    public void createConcreteProduct() {
        Factory factoryA = new ConcreteProductFactoryA();
        factoryA.createProduct().operation();

        Factory factoryB = new ConcreteProductFactoryB();
        factoryB.createProduct().operation();
    }
}
