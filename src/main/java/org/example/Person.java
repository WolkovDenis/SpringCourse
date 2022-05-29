package org.example;

public class Person {

    String name;
    int age;
    Pet pet;

    void comeMyPet(){
        System.out.println("Привет");
        pet.say();
    }

    public Person() {
        System.out.println("Person is create");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
