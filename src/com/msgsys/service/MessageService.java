package com.msgsys.service;

import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/11/26 18:50
 * 描述:
 */
public interface MessageService {
    List<Message> queryByToUid(Integer id);
    Message queryById(Integer id);
}
