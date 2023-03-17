package com.hom.puppy.factory;

/**
 * ShapeFactory
 *
 * @author hexiaogou
 * @desc shape factory
 * @date 2023-03-17 18:14
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
