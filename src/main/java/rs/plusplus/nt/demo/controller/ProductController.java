package rs.plusplus.nt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.plusplus.nt.demo.model.Product;
import rs.plusplus.nt.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get/all")
    public List<Product> getAll() {
        return this.productService.getAll();
    }
    
    @PostMapping("/add")
    public Product add(@RequestBody Product product) {
         return this.productService.add(product);
    }
    
    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
         return this.productService.update(product);
    }
    
    @DeleteMapping("/delete/{productID}")
    public Product delete(@PathVariable("productID") int productID) {
        return this.productService.delete(productID);
    }
    @PostMapping("/getbyid")
    public Product getByID(@RequestBody Product product) {
        return this.productService.getByID(product);
    }
}
