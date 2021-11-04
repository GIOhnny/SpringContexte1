package main;

import beans.MyBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    /**
     * XML
     * Annotations
    */
    public static void main(String[] args) {
        //contextul se configureaza cu o clasa de configurare pusa cu @Configutation
        try (var context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            //request by Type
            MyBean b1 = context.getBean(MyBean.class);
            //Daca avem mai multe beanuri de acelasi tip atunci cerem bean ul by Name
            MyBean b2 = context.getBean("myBean2", MyBean.class);
            //sau prin alias
            MyBean b3 = context.getBean("trei", MyBean.class);

            System.out.println(b1.getText());
            System.out.println(b2.getText());
            System.out.println(b3.getText());
        }
    }
}
