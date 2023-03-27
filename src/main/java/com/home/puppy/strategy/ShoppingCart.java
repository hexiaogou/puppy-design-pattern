package com.home.puppy.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart
 *
 * @author hexiaogou
 * @desc shopping cart
 * @date 2023-03-27 21:17
 */
public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
