package com.home.puppy.observer;

/**
 * TVDisplay
 *
 * @author hexiaogou
 * @desc tv display
 * @date 2023-03-27 20:03
 */
public class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: The temperature is " + temperature + " degrees.");
    }
}
