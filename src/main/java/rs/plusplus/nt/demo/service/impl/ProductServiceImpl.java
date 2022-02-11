package rs.plusplus.nt.demo.service.impl;

import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.Product;
import rs.plusplus.nt.demo.model.ProductSupplier;
import rs.plusplus.nt.demo.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final List<Product> list=new ArrayList<Product>();


    public ProductServiceImpl() {
        ProductSupplier s1=new ProductSupplier(1,"Gembird");
        ProductSupplier s2=new ProductSupplier(2,"Gama group");
        ProductSupplier s3=new ProductSupplier(3,"PC Center");
        ProductSupplier s4=new ProductSupplier(4,"Pin soft");
        ProductSupplier s5=new ProductSupplier(5,"Vitel");
        ProductSupplier s6=new ProductSupplier(6,"Zoom Impex");
        ProductSupplier s7=new ProductSupplier(7,"EWE");
        ProductSupplier s8=new ProductSupplier(8,"EPI Computers");
        List<ProductSupplier> suppliers1=new ArrayList<>();
        suppliers1.add(s1);
        suppliers1.add(s2);
        suppliers1.add(s3);
        List<ProductSupplier> suppliers2=new ArrayList<>();
        suppliers2.add(s4);
        suppliers2.add(s5);
        suppliers2.add(s6);
        List<ProductSupplier> suppliers3=new ArrayList<>();
        suppliers3.add(s1);
        suppliers3.add(s4);
        suppliers3.add(s8);
        List<ProductSupplier> suppliers4=new ArrayList<>();
        suppliers4.add(s2);
        suppliers4.add(s7);
        suppliers4.add(s8);



        list.add(new Product(1,"Motherboard Gigabyte",30000,suppliers1));
        list.add(new Product(2,"Headset HyperX Cloud II",16000,suppliers2));
        list.add(new Product(3,"Mouse Razer Wireless",19000,suppliers3));
        list.add(new Product(4,"Mouse pad ",2000,suppliers3));
        list.add(new Product(5,"Keyboard Alienware aw787 full RGB",16000,suppliers2));
        list.add(new Product(6,"Monitor 144hz",24000,suppliers4));
        list.add(new Product(7,"Processor i5-8400 2.8ghz",25000,suppliers3));
        list.add(new Product(8,"Power supply 5000",6000,suppliers4));
        list.add(new Product(9,"Ram memory 16gb",8000,suppliers2));
        list.add(new Product(10,"SSD memory 500gb",8000,suppliers4));
        list.add(new Product(11,"HDD memory 500gb",4000,suppliers3));

    }

    @Override
    public List<Product> getAll() {
        return list;
    }

    @Override
    public Product add(Product product) {
        list.add(product);
        return product;
    }

    @Override
    public Product delete(int productID) {
        Product product = list.stream().filter(pr-> pr.getProductID() == productID).findFirst().get();
        list.remove(product);
        return product;
    }

    @Override
    public Product update(Product product) {
       for(int i=0; i<list.size(); i++){
           if(list.get(i).equals(product)) {
               list.get(i).setPrice(product.getPrice());
               list.get(i).setProductName(product.getProductName());
               return list.get(i);
           }
       }
       return null;
    }

    @Override
    public Product getByID(Product product) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(product)) {
                return list.get(i);
            }
        }
        return null;
    }
}
