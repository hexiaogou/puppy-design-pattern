package com.home.puppy.observer;

/**
 * PhoneDisplay
 *
 * @author hexiaogou
 * @desc phone display
 * @date 2023-03-27 20:02
 */
public class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: The temperature is " + temperature + " degrees.");
    }
}
