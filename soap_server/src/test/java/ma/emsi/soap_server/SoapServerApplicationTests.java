package ma.emsi.soap_server;

import ma.emsi.soap_server.models.Product;
import ma.emsi.soap_server.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SoapServerApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testCreateProducts(){
        List<Product> productList = List.of(
                new Product(1,"Table",300.00,new Date()),
                new Product(2,"Pen",3.00,new Date()),
                new Product(3,"Cheese",30.00,new Date()),
                new Product(4,"Bread",6.00,new Date())
                );
        productRepository.saveAll(productList);
    }

}
