package com.hom.puppy.singleton;

/**
 * Singleton
 *
 * @author hexiaogou
 * @desc singleton
 * @date 2023-03-17 18:56
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
