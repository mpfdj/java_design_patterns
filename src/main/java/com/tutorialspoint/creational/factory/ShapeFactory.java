package com.tutorialspoint.creational.factory;

public class ShapeFactory {

    // Use getShape method to get object of type shape
    public Shape getShape(String shareType) {
        if (shareType == null) return null;
        if (shareType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shareType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        if (shareType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
