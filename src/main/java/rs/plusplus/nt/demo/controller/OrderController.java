package rs.plusplus.nt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.plusplus.nt.demo.model.Order;
import rs.plusplus.nt.demo.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
   
    @Autowired
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get/all")
    public List<Order> getAll() {
        return this.orderService.getAll();
    }

    @PostMapping("/add")
    public Order add(@RequestBody Order order) {
        return this.orderService.add(order);
    }
    
    @DeleteMapping("/delete/{orderID}")
    public Order delete(@PathVariable("orderID") int orderID) {
        return this.orderService.delete(orderID);
    }
}
