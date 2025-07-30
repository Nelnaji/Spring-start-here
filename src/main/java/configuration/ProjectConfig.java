package configuration;

import entity.Parrot;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "entity")
public class ProjectConfig {



/* @Bean
  Person person(){
  Person p = new Person();
  p.setName("Alice");
  p.setParrot(parrot());
  return p;
 }

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }*/

}
