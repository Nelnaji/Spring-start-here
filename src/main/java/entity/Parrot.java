package entity;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public Parrot() {
    }


    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
