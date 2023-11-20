package com.sparta.ua.singleton;

public class SingletonExample {
    private static final SingletonExample example = new SingletonExample();

    private SingletonExample() {} //constructor only accessible within this class

    public static SingletonExample getSingleton(){
        //has to be static
//        if(example == null){
//            example = new SingletonExample();
//        }
        return example;
    }
}
