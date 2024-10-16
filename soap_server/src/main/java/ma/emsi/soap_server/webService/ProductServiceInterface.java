package ma.emsi.soap_server.webService;

import ma.emsi.soap_server.models.Product;

import java.util.List;

public interface ProductServiceInterface {

    Product saveProduct(Product p);
    Product updateProduct(Product p);
    void deleteProduct(Product p);
    void deleProductById(Integer code);
    Product getProduct(Integer code);
    List<Product> getAllProducts();
}
