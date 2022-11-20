package com.tutorialspoint.creational.prototype;

import lombok.Getter;
import lombok.Setter;

public abstract class Shape implements Cloneable {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    protected String type;

    abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
