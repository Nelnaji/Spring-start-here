package configuration;

import entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "entity")
public class ProjectConfig {

 /*   @Bean
     public static Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;

    }
    @Bean("Miki")
    public static Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;

    }

    @Bean
    @Primary
    public static Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Mik1i");
        return p;

    }


    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }*/
}
