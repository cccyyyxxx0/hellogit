package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/11/26 18:37
 * 描述:
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int insert(Message message) {
        String sql="INSERT INTO `msg` (`fromUid`, `toUid` ,`mtitle`,`mcontent`,`readFlag`,`createtime`) VALUES (?,?,?,?,?,?)";
        return update(sql,message.getFromUid(),message.getToUid(),message.getMtitle(),message.getMcontent(),message.getReadFlag(),message.getCreatetime());

    }

    @Override
    public int delete(Integer id) {
        String sql="DELETE FROM `msg` WHERE `id` = ?";
        return update(sql,id);
    }

    @Override
    public int update(Message message) {
        String sql = "UPDATE `msg` SET `fromUid` = ?,`toUid`=?, `mtitle`=?, `mcontent`=?,`readFlag`=?,`createtime`=? WHERE `id`=? ";
        return update(sql,message.getFromUid(),message.getToUid(),message.getMtitle(),message.getMcontent(),message.getReadFlag(),message.getCreatetime(),message.getId());

    }

    @Override
    public Message queryById(Integer id) {
        String sql="SELECT * FROM `msg` WHERE `id` = ?";
        return queryForOne(Message.class,sql,id);
    }

    @Override
    public List<Message> queryAll() {
        String sql="SELECT * FROM `msg`";
        return queryForList(Message.class,sql);

    }

    @Override
    public List<Message> queryByToUid(Integer id) {
        String sql="SELECT * FROM `msg` WHERE `toUid` = ?";
        return queryForList(Message.class,sql,id);
    }
}
