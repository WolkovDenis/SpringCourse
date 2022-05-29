package org.example;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat is create");
    }

    @Override
    public void say() {
        System.out.println("мяу");

    }
}
