package com.home.puppy.adapter;

import org.junit.jupiter.api.Test;

/**
 * AdapterTest
 *
 * @author hexiaogou
 * @desc adapter test
 * @date 2023-03-27 17:38
 */
public class AdapterTest {
    @Test
    public void adapterTest() {
        Adapted adapted = new Adapted();
        Target target = new Adapter(adapted);
        target.request();
    }
}
