package rs.plusplus.nt.demo.service.impl;

import org.springframework.stereotype.Service;
import rs.plusplus.nt.demo.model.Order;
import rs.plusplus.nt.demo.model.Product;
import rs.plusplus.nt.demo.service.OrderService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final List<Order> orders = new LinkedList<>();

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public Order add(Order order) {
        orders.add(order);
        Order addedOrder = orders.stream().filter(or -> or.getOrderID() == order.getOrderID()).findFirst().get();
        return addedOrder;
    }


    @Override
    public Order delete(int orderID) {
        Order foundOrder = orders.stream().filter(or -> or.getOrderID() == orderID).findFirst().get();
        orders.remove(foundOrder);
        return foundOrder;
    }


}
