package com.wangqi.dao;


import com.wangqi.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO {
    //创建订单方法
    void createOrder(Order order);
}
