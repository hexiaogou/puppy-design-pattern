package com.home.puppy.factory;

/**
 * ConcreteProductA
 *
 * @author hexiaogou
 * @desc concrete product A
 * @date 2023-03-27 17:05
 */
public class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }
}
