package main;

import configuration.ProjectConfig;
import entity.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Context créer
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
