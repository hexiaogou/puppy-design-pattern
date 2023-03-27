package com.home.puppy.strategy;

import org.junit.jupiter.api.Test;

/**
 * StrategyTest
 *
 * @author hexiaogou
 * @desc strategy test
 * @date 2023-03-27 21:20
 */
public class StrategyTest {
    @Test
    public void strategyPatternTest() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "786",
                "12/15"));

        cart.pay(new PayPalStrategy("my_email@example.com", "my_pwd"));
    }
}
