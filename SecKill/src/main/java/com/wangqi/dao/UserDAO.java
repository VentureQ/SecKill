package com.wangqi.dao;


import com.wangqi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    User findById(Integer id);
}