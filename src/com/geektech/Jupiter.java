package com.geektech;

public class Jupiter extends Planet{

    private int satellitesNumber;
    private String biggestSatellite;

    public Jupiter(String name, String type, int diameter, int satellitesNumber, String biggestSatellite) {
        super(name, type, diameter);
        this.satellitesNumber = satellitesNumber;
        this.biggestSatellite = biggestSatellite;
    }

    @Override
    public void print() {
        System.out.println("The " + getName() + " is a " + getType() + " type planet and " +
                getDiameter() + " km wide. The " + getName() + " has " +
                satellitesNumber + " satellites, the largest of which is the " + biggestSatellite + ".");
    }
}
