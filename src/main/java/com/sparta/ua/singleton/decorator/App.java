package com.sparta.ua.singleton.decorator;

import com.sparta.ua.singleton.decorator.sides.Chips;
import com.sparta.ua.singleton.decorator.sides.Salad;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription()+ "Cost: " + italian.getCost());

        Salad salad = new Salad(italian);//salad class is decorating this object
        System.out.println(salad.getDescription()+ "Cost: " + salad.getCost());

        Chips chips = new Chips(italian);//chips class is decorating the pizza object
        System.out.println(chips.getDescription()+ "Cost: " + chips.getCost());
    }
}
