package rs.plusplus.nt.demo.service;

import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.ProductSupplier;

import java.util.List;

@Service
public interface SupplierService {
    List<ProductSupplier> getAll();
}
