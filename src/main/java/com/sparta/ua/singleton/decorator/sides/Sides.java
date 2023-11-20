package com.sparta.ua.singleton.decorator.sides;

import com.sparta.ua.singleton.decorator.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
