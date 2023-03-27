package com.home.puppy.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * IteratorTest
 *
 * @author hexiaogou
 * @desc iterator test
 * @date 2023-03-27 21:30
 */
public class IteratorTest {
    @Test
    public void iteratorTest() {
        ItemCollection itemCollection = new ItemCollection();
        itemCollection.addItem(new Item("Item1", 10.0));
        itemCollection.addItem(new Item("Item2", 20.0));
        itemCollection.addItem(new Item("Item3", 30.0));
        itemCollection.addItem(new Item("Item4", 40.0));

        Iterator itemIterator = itemCollection.getIterator();
        while (itemIterator.hasNext()) {
            Item item = (Item)itemIterator.next();
            System.out.println("Item name: " + item.getName() + ", Price : " + item.getPrice());
        }
        Assertions.assertFalse(itemIterator.hasNext());
    }
}
