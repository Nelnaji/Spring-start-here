package configuration;

import entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
     public static Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;

    }


    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
