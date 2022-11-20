package com.tutorialspoint.creational.builder;

public abstract class ColdDrink implements Item {

    @Override
    public Bottle packing() {
        return new Bottle();
    }

}
