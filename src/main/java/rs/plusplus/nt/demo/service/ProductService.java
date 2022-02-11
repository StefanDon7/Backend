package rs.plusplus.nt.demo.service;


import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.Product;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAll();
    Product add(Product product);
    Product delete(int productID);
    Product update(Product product);
    Product getByID(Product product);
    
}
