package com.hom.puppy.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * SingletonTest
 *
 * @author hexiaogou
 * @desc singleton test
 * @date 2023-03-17 18:58
 */
class SingletonTest {
    @Test
    void createSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertEquals(s1, s2);
    }
}