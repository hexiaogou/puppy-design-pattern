package com.hom.puppy.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ShapeGenericFactoryTest
 *
 * @author hexiaogou
 * @desc shape generic factory test
 * @date 2023-03-17 18:39
 */
class ShapeGenericFactoryTest {

    @Test
    void draw() throws Exception {
        ShapeGenericFactory<Circle> factoryA = new ShapeGenericFactory<>();
        Circle circle = factoryA.createShape(Circle.class);
        circle.draw();

        ShapeGenericFactory<Rectangle> factoryB = new ShapeGenericFactory<>();
        Rectangle rectangle = factoryB.createShape(Rectangle.class);
        rectangle.draw();

        ShapeGenericFactory<Square> factoryC = new ShapeGenericFactory<>();
        Square square = factoryC.createShape(Square.class);
        square.draw();

        assertTrue(square instanceof Shape);
    }
}