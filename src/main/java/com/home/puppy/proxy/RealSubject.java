package com.home.puppy.proxy;

/**
 * RealSubject
 *
 * @author hexiaogou
 * @desc real subject
 * @date 2023-03-27 21:59
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject doing request...");
    }
}
