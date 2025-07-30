package entity;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Parrot {

    private String name;

//    private final Person person;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
