package rs.plusplus.nt.demo.service.impl;

import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.ProductSupplier;
import rs.plusplus.nt.demo.service.SupplierService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    private final List<ProductSupplier> suppliers=new ArrayList<>();

    public SupplierServiceImpl() {
        suppliers.add(new ProductSupplier(1,"Gembird"));
        suppliers.add(new ProductSupplier(2,"Gama group"));
        suppliers.add(new ProductSupplier(3,"PC Center"));
        suppliers.add(new ProductSupplier(4,"Pin soft"));
        suppliers.add(new ProductSupplier(5,"Vitel"));
        suppliers.add(new ProductSupplier(6,"Zoom Impex"));
        suppliers.add(new ProductSupplier(7,"EWE"));
        suppliers.add(new ProductSupplier(8,"EPI Computers"));
    }

    @Override
    public List<ProductSupplier> getAll() {
        return suppliers;
    }
}
