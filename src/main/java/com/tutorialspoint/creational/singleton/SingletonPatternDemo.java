// https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

package com.tutorialspoint.creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // Show the message
        object.showMessage();
    }
}
