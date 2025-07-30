package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";


    private final  Parrot parrot;


    // Most real-life example
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;

    }



    //    @Autowired  Can be ommited starting from Spring v 4.3 when only one constructor


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +                '}';
    }
}
