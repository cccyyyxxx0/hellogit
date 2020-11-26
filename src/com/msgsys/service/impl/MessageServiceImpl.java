package com.msgsys.service.impl;

import com.msgsys.dao.MessageDao;
import com.msgsys.dao.impl.MessageDaoImpl;
import com.msgsys.entity.Message;
import com.msgsys.service.MessageService;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/11/26 18:51
 * 描述:
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao=new MessageDaoImpl();
    @Override
    public List<Message> queryByToUid(Integer id) {
        return messageDao.queryByToUid(id);
    }

    @Override
    public Message queryById(Integer id) {
        return messageDao.queryById(id);
    }
}
