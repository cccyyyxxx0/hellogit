package com.msgsys.dao;

import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/11/26 18:34
 * 描述:
 */
public interface MessageDao {
    int insert(Message message);
    int delete(Integer id);
    int update(Message message);
    Message queryById(Integer id);
    List<Message> queryAll();
    List<Message> queryByToUid(Integer id);
}
