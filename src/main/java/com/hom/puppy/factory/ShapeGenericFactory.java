package com.hom.puppy.factory;

/**
 * ShapeGenericFactory
 *
 * @author hexiaogou
 * @desc shape generic factory
 * @date 2023-03-17 18:39
 */
public class ShapeGenericFactory<T extends Shape> {
    public T createShape(Class<T> clazz) throws Exception {
        return clazz.newInstance();
    }
}
