package com.zzy.test;

import com.zzy.pojo.Book;
import com.zzy.pojo.Page;
import com.zzy.service.BookService;
import com.zzy.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceTest {
    private BookService bookService = new BookServiceImpl();

    @Test
    public void addBook() {
        bookService.addBook(new Book(null, "测试插入", "zzy", new BigDecimal(999), 1933, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);

    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22, "测试插入update", "zzy", new BigDecimal(999), 1933, 0, null));
    }

    @Test
    public void queryById() {
        System.out.println(bookService.queryById(22));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void page(){
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }

    @Test
    public void pageByPrice() {
        System.out.println(bookService.pageByPrice(1, Page.PAGE_SIZE,10,50));
    }
}