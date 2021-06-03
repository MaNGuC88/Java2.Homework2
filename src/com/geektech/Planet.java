package com.geektech;

public class Planet implements Printable {

    private String name;
    private String type;
    private int diameter;

    public Planet(String name, String type, int diameter) {
        this.name = name;
        this.type = type;
        this.diameter = diameter;
    }

    public Planet(String className) {
        this.name = className;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void print() {
        System.out.println("The " + name + " is a " + type + " type " +
                " and is " + diameter + " km wide");
    }
}
