package com.tutorialspoint.creational.decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        decoratedShape = shape;
    }

}
