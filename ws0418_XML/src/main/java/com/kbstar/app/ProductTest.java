package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>) factory.getBean("pservice");

        ProductDTO product1 = new ProductDTO("id01", "strawberryPrincess", 38000, 550 );
        ProductDTO product2 = new ProductDTO("id02", "chocoPrincess", 35000, 520 );

        service.register(product1);
        service.modify(product2);
        service.remove("id01");
        service.get("id02");
        service.get();
    }
}
