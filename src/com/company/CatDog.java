package com.company;

public class CatDog {

    public int height = 180;
    public String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public CatDog() {
    }

    public CatDog(int h, String n) {
        height = h;
        name = n;
    }

    public CatDog(String n) {
        name = n;
    }
}
