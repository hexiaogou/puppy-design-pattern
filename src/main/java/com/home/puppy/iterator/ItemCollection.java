package com.home.puppy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ItemCollection
 *
 * @author hexiaogou
 * @desc item collection
 * @date 2023-03-27 21:28
 */
public class ItemCollection implements Container {
    private List<Item> items;


    public ItemCollection() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public Iterator getIterator() {
        return new ItemIterator();
    }

    // 内部迭代器类
    private class ItemIterator implements Iterator {
        private int index;

        public boolean hasNext() {
            if (index < items.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return items.get(index++);
            }
            return null;
        }
    }
}
