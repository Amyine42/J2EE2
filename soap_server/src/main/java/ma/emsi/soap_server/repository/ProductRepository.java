package ma.emsi.soap_server.repository;

import ma.emsi.soap_server.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
