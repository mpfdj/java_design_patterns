package com.tutorialspoint.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return (float) items.stream().mapToDouble(i -> i.price()).sum();
    }

    public void showItems() {
        items.forEach(i -> {
            System.out.print("Item: " + i.name());
            System.out.print(", Packing: " + i.packing().pack());
            System.out.println(", Price: " + i.price());
        });
    }

}
