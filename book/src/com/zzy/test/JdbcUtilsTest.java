package com.zzy.test;

import com.zzy.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils() {
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
//            JdbcUtils.Close(connection);

            JdbcUtils.commitAndClose();
        }
    }
}
