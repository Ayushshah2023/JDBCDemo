package com.telstra.OrderService.service;

import com.telstra.OrderService.entity.Orderss;
import com.telstra.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Orderss addOrder(Orderss order) {
        return orderRepository.save(order);
    }

    @Override
    public Orderss getOrderById(long orderID) {
        return orderRepository.findById(orderID).get();
    }

    @Override
    public String deleteOrderById(long orderID) {
        orderRepository.deleteById(orderID);
        return "Order Deleted !!";
    }

    @Override
    public List<Orderss> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Orderss updateOrder(Long orderID, Orderss order) {

        Orderss orderdb = orderRepository.findById(orderID).get();

        if(Objects.nonNull(order.getOrderName()) &&
                !"".equalsIgnoreCase(order.getOrderName())){
            orderdb.setOrderName(order.getOrderName());
        }

        return orderRepository.save(orderdb);

    }
}
