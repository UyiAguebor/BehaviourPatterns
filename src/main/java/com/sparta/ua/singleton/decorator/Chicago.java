package com.sparta.ua.singleton.decorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
