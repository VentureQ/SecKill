package com.wangqi.dao;


import com.wangqi.entity.Stock;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDAO {

    //根据商品id查询库存信息的方法
    Stock checkStock(Integer id);

    //根据商品id扣除库存
    int updateSale(Stock stock);
}
