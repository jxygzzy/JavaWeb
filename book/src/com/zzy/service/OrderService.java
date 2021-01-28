package com.zzy.service;

import com.zzy.pojo.Cart;
import com.zzy.pojo.Order;
import com.zzy.pojo.OrderItem;

import java.util.List;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);

    List<Order> myOrders(Integer userId);

    Order orderDetails(String orderId);

    List<Order> allOrders();

    int sendOrder(String orderId);

    int receiveOrder(String orderId);


}
