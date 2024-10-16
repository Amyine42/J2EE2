package ma.emsi.soap_server.webService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.emsi.soap_server.models.Product;
import ma.emsi.soap_server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "ProductWS")
public class ProductWebService implements ProductServiceInterface{

    @Autowired
    ProductRepository productRepository;
    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "price") Double price){
        return price*1.5;
    }

    /*@WebMethod
    public Product getProduct(Integer code){
        return new Product(code,"Table",300.00,new Date());
    } */

    @Override
    public Product getProduct(Integer code) {
        return productRepository.findById(code).get();
    }
    @Override
    public Product saveProduct(Product p) {
        return productRepository.save(p);
    }
    @Override
    public Product updateProduct(Product p){
        return productRepository.save(p);
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public void deleteProduct(Product p) {
        productRepository.delete(p);
    }

    @Override
    public void deleProductById(Integer code) {
        productRepository.deleteById(code);
    }



    @WebMethod
    public List<Product> productList(){
        return List.of(
                new Product(1,"Table",300.00,new Date()),
                new Product(2,"Pen",3.00,new Date()),
                new Product(3,"Cheese",30.00,new Date()),
                new Product(4,"Bread",6.00,new Date())
        );
    }


}
