package com.gaocimi.flashpig.dao;

import com.gaocimi.flashpig.entity.UserOrder;
import com.gaocimi.flashpig.entity.UserOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * @author liyutg
 * @date 2019/6/12 2:16
 * @description
 */
@Mapper
@Component
public interface UserOrderMapper {
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