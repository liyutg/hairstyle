package com.gaocimi.flashpig.service;

import com.gaocimi.flashpig.entity.UserOrder;
import com.gaocimi.flashpig.entity.UserOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
public interface IUserOrderService {
    int countByExample(UserOrderExample example);

    int deleteByExample(UserOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    List<UserOrder> selectByExample(UserOrderExample example);

    UserOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    int updateByExample(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}