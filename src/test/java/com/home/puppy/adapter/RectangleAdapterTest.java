package com.home.puppy.adapter;

import org.junit.jupiter.api.Test;

/**
 * RectangleAdapterTest
 *
 * @author hexiaogou
 * @desc rectangle adapter test
 * @date 2023-03-27 17:54
 */
public class RectangleAdapterTest {
    @Test
    public void adapterTest() {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape adapter = new RectangleAdapter(legacyRectangle);
        adapter.draw(10, 20, 30, 40);
    }
}
