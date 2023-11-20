package com.sparta.ua.singleton.factory;



import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("my-logger");

        Drivable vehicle = DrivableFactory.getVehicle("bike");
        Car car1 = new Car();

    }
}
