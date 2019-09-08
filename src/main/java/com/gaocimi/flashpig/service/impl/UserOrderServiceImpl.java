package com.gaocimi.flashpig.service.impl;

import com.gaocimi.flashpig.entity.UserOrder;
import com.gaocimi.flashpig.entity.UserOrderExample;
import com.gaocimi.flashpig.service.IUserOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
@Service
public class UserOrderServiceImpl implements IUserOrderService {

    @Override
    public int countByExample(UserOrderExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserOrderExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(UserOrder record) {
        return 0;
    }

    @Override
    public List<UserOrder> selectByExample(UserOrderExample example) {
        return null;
    }

    @Override
    public UserOrder selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserOrder record, UserOrderExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserOrder record, UserOrderExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserOrder record) {
        return 0;
    }
}