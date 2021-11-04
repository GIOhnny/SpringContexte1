package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"beans"})
public class ProjectConfig {
    @Bean
    public Cat cat() {
        Cat c = new Cat();
        c.setName("Tom");
        return c;
    }

/* varianta 1 - fara @Autowired
    @Bean
    public Owner owner() {
        Owner o = new Owner();
        //aici ia Bean ul din context
        o.setCat(cat());
        //aici nu ia instanta care trebuie
        //o.setCat(new Cat());
        return o;
    }
*/

/* varianta 2 - fara @Autowired*/
    @Bean
    public Owner owner(Cat cat) {
        Owner o = new Owner();
        o.setCat(cat);
        return o;
    }
}
