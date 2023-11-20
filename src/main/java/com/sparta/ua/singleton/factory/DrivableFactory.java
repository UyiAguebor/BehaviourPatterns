package com.sparta.ua.singleton.factory;

public class DrivableFactory {

    public static Drivable getVehicle(String name) {
        switch (name) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "boat":
                return new Boat();
        }
        return null;
    }
}
