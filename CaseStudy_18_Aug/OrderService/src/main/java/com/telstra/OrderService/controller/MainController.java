package com.telstra.OrderService.controller;
import com.telstra.OrderService.entity.Orderss;
import com.telstra.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome!!";
    }

    @PostMapping("/order")
    public Orderss addOrder(@RequestBody Orderss order) {
        return orderService.addOrder(order);
    }

    @GetMapping("/order")
    public List<Orderss> getAllOrders(){
        return this.orderService.getAllOrders();
    }

    @GetMapping("/order/{orderID}")
    public Orderss getOrderById(@PathVariable("orderID") Long orderID){
        return this.orderService.getOrderById(orderID);
    }

    @DeleteMapping("/order/{orderID}")
    public String deleteOrderById(@PathVariable("orderID") Long orderID){
        return this.orderService.deleteOrderById(orderID);
    }

    @PutMapping("/order/{orderID}")
    public Orderss updateOrder(@PathVariable("orderID") Long orderID, @RequestBody Orderss order){
        return orderService.updateOrder(orderID, order);
    }

}