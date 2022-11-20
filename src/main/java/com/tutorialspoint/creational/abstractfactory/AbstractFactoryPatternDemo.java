// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

package com.tutorialspoint.creational.abstractfactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        // Normal shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();


        // Rounded shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();
    }

}
