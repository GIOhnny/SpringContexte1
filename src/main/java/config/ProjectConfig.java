package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
//metoda care returneaza instanta bean ului catre context
    @Bean
    @Primary
    //primary defineste bean ul principal ce va fi returnat contextului intrucat
    //avem 2 bean uri care returneaza MyBean si Spring nu stie pe care sa o aleaga
    public MyBean myBean() {
        MyBean b= new MyBean();
        b.setText("Hello");
        return b;
    }

    @Bean
    public MyBean myBean2() {
        MyBean b= new MyBean();
        b.setText("World");
        return b;
    }

    @Bean("trei")
    public MyBean myBean3() {
        MyBean b= new MyBean();
        b.setText("!!!");
        return b;
    }


}
