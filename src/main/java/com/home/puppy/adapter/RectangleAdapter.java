package com.home.puppy.adapter;

/**
 * RectangleAdapter
 *
 * @author hexiaogou
 * @desc rectangle adapter
 * @date 2023-03-27 17:52
 */
public class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }


    @Override
    public void draw(int x, int y, int w, int h) {
        // convert new coordinates to legacy coordinates
        int topLeftX = x;
        int topLeftY = y;
        int bottomRightX = x + w;
        int bottomRightY = y + h;
        legacyRectangle.display(topLeftX, topLeftY, bottomRightX, bottomRightY);
    }
}
