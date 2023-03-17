package com.hom.puppy.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ShapeFactoryTest
 *
 * @author hexiaogou
 * @desc shape factory test
 * @date 2023-03-17 18:16
 */
class ShapeFactoryTest {
    @Test
    void draw() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");

        circle.draw();
        rectangle.draw();
        square.draw();

        Assertions.assertTrue(circle instanceof Circle);
    }
}