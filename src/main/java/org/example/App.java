package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //    Pet pet = context.getBean("pet", Pet.class);
        //  pet.say();

        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        person2.setName("Ivan");
        person2.setAge(30);

        System.out.println("Person name" + " " + person.name);
        System.out.println("Person age" + " " + person.age);

        System.out.println("Person2 name" + " " + person2.name);
        System.out.println("Person2 age" + " " + person2.age);

        //   person.comeMyPet();
        //   System.out.println(person.age);
        //  System.out.println(person.name);


    }
}
