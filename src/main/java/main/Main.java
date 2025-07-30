package main;

import configuration.ProjectConfig;
import beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Context créer
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println(person.getName());
        System.out.println(person.getParrot()); // print null since the parrot has not been instanciated. normal


    }
}
