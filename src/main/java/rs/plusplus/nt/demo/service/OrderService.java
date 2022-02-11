package rs.plusplus.nt.demo.service;

import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.Order;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAll();

    Order add(Order order);
    
    Order delete(int orderID);
}
