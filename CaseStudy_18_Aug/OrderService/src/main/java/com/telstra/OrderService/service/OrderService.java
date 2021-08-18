package com.telstra.OrderService.service;

import com.telstra.OrderService.entity.Orderss;

import java.util.List;

public interface OrderService {
  

    Orderss getOrderById(long parseLong);

    Orderss addOrder(Orderss order);

    String deleteOrderById(long parseLong);

    List<Orderss> getAllOrders();

    Orderss updateOrder(Long userId, Orderss order);
}
