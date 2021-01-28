package com.zzy.test;

import com.zzy.pojo.Cart;
import com.zzy.pojo.CartItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CartTest {


    @Test
    public void addItem() {

        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(2, "测试书名2", 1, new BigDecimal(100), new BigDecimal(100)));
        System.out.println(cart);
    }

    @Test
    public void deleteItem() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(2, "测试书名2", 1, new BigDecimal(100), new BigDecimal(100)));

        cart.deleteItem(1);
        System.out.println(cart);
    }

    @Test
    public void clear() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(2, "测试书名2", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.deleteItem(1);
        cart.clear();
        System.out.println(cart);
    }

    @Test
    public void updateCount() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.addItem(new CartItem(2, "测试书名2", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.deleteItem(1);
        cart.clear();
        cart.addItem(new CartItem(1, "测试书名1", 1, new BigDecimal(99), new BigDecimal(99)));
        cart.updateCount(1,10);
        System.out.println(cart);
    }
}