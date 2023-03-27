package com.home.puppy.decorator;

import org.junit.jupiter.api.Test;

/**
 * DecoratorTest
 *
 * @author hexiaogou
 * @desc decorator test
 * @date 2023-03-27 19:32
 */
public class DecoratorTest {
    @Test
    public void decoratorPattern() {
        Pizza margherita = new Margherita();

        margherita = new Cheese(margherita);

        margherita = new Pepperoni(margherita);

        System.out.println(margherita.getDesc());
        System.out.println("Cost: $" + margherita.getCost());
    }
}
