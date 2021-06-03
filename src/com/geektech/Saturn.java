package com.geektech;

public class Saturn extends Planet {

    private int ringsLength;
    private int ringsNumber;

    public Saturn(String name, String type, int diameter, int ringsLength, int ringsNumber) {
        super(name, type, diameter);
        this.ringsLength = ringsLength;
        this.ringsNumber = ringsNumber;
    }

    @Override
    public void print() {
        System.out.println("The " + getName() + " is a " + getType() + " type planet and " +
                getDiameter() + " km wide. The " + getName() + " has " +
                ringsNumber + " main rings, biggest of which is " + ringsLength + " km long.");
    }
}
