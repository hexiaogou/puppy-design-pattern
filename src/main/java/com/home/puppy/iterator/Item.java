package com.home.puppy.iterator;

/**
 * Item
 *
 * @author hexiaogou
 * @desc item
 * @date 2023-03-27 21:28
 */
public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
