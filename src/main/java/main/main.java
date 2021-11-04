package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

public class main {
    /**
     * XML
     * Annotations
    */
    public static void main(String[] args) {
        //contextul se configureaza cu o clasa de configurare pusa cu @Configutation
        try (var context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
            service.addSomeProducts();
        }
    }
}
