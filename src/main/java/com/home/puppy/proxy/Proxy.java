package com.home.puppy.proxy;

/**
 * Proxy
 *
 * @author hexiaogou
 * @desc proxy
 * @date 2023-03-27 22:00
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("Proxy preRequest...");
    }

    public void postRequest() {
        System.out.println("Proxy postRequest...");
    }
}
