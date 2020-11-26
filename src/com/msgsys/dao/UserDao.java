package com.msgsys.dao;

import com.msgsys.entity.User;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/11/26 15:43
 * 描述:
 */
public interface UserDao {
    int insert(User user);
    int delete(Integer id);
    int update(User user);
    User queryUserById(Integer id);
    List<User> queryAll();
    User queryUserByUsernameAndPassword(User user);
}
