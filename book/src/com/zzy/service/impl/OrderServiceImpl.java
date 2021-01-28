package com.zzy.service.impl;

import com.zzy.dao.BookDao;
import com.zzy.dao.OrderDao;
import com.zzy.dao.OrderItemDao;
import com.zzy.dao.impl.BookDaoImpl;
import com.zzy.dao.impl.OrderDaoImpl;
import com.zzy.dao.impl.OrderItemDaoImpl;
import com.zzy.pojo.*;
import com.zzy.service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public String createOrder(Cart cart, Integer userId) {
        // 订单号===唯一性
        String orderId = System.currentTimeMillis() + "" + userId;
        // 创建一个订单对象
        Order order = new Order(orderId, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), cart.getTotalPrice(), 0, userId);
        // 保存订单
        orderDao.saveOrder(order);

        // 遍历购物车中每一个商品项转换成为订单项保存到数据库
        for (Map.Entry<Integer, CartItem> entry : cart.getItems().entrySet()) {
            // 获取每一个购物车中的商品项
            CartItem cartItem = entry.getValue();
            // 转换为每一个订单项
            OrderItem orderItem = new OrderItem(null, cartItem.getName(), cartItem.getCount(), cartItem.getPrice(), cartItem.getTotalPrice(), orderId);
            // 保存订单项到数据库
            orderItemDao.saveOrderItem(orderItem);

            // 更新库存和销量
            Book book = bookDao.queryBookById(cartItem.getId());
            book.setSales(book.getSales() + cartItem.getCount());
            book.setStock(book.getStock() - cartItem.getCount());
            bookDao.updateBook(book);

        }
        // 清空购物车
        cart.clear();

        return orderId;
    }

    @Override
    public List<Order> myOrders(Integer userId) {

        return orderDao.queryMyOrders(userId);
    }

    @Override
    public Order orderDetails(String orderId) {
        return orderDao.queryOrderDetailById(orderId);
    }

    @Override
    public List<Order> allOrders() {
        return orderDao.queryAllOrders();
    }

    @Override
    public int sendOrder(String orderId) {

        Order order = orderDetails(orderId);
        return orderDao.changeOrderStatus(order, 1);
    }

    @Override
    public int receiveOrder(String orderId) {

        Order order = orderDetails(orderId);
        return orderDao.changeOrderStatus(order, 2);

    }
}
