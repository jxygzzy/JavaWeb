package com.zzy.dao;

import com.zzy.pojo.Order;

import java.util.List;

public interface OrderDao {

    public int saveOrder(Order order);

    List<Order> queryMyOrders(Integer userId);

    Order queryOrderDetailById(String orderId);

    List<Order> queryAllOrders();

    public int changeOrderStatus(Order order, int status);
}
