package com.geektech;

public class Main {

    public static void main(String[] args) {

        createObject("mars").print();
        createObject("saturn").print();
        createObject("jupiter").print();

    }

    public static Planet createObject(String className) {

        Planet newPlanet = new Planet(className);

        switch (className) {
            case "mars":
                return new Mars("Mars", "rock", 6779, "red", 56);
            case "saturn":
                return new Saturn("Saturn", "gas", 116460,
                        282000, 3);
            case "jupiter":
                return new Jupiter("Jupiter", "gas", 139820,
                        79, "Ganymede");
        }
        return newPlanet;
    }
}
