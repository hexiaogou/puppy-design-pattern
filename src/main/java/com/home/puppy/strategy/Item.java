package com.home.puppy.strategy;

/**
 * Item
 *
 * @author hexiaogou
 * @desc item
 * @date 2023-03-27 21:16
 */
public class Item {
    private String id;
    private int price;

    public Item(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
