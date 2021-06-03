package com.geektech;

public class Mars extends Planet {

    private String color;
    private int distanceFromEarth;

    public Mars(String name, String type, int diameter, String color, int distanceFromEarth) {
        super(name, type, diameter);
        this.color = color;
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public void print() {
        System.out.println("The " + getName() + " is a " + getType() + " type planet and " +
                getDiameter() + " km wide. The " + getName() + " is " + color +
                " and is " + distanceFromEarth + " mln km away from the Earth.");
    }
}
