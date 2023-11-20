package com.sparta.ua.singleton.factory;

public class Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    public void stop(){
        System.out.println("Stop the car");
    }
}
