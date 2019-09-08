package com.gaocimi.flashpig.dao;

import com.gaocimi.flashpig.entity.Hairstylist;
import com.gaocimi.flashpig.entity.HairstylistExample;
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

public interface HairstylistMapper {
    int countByExample(HairstylistExample example);

    int deleteByExample(HairstylistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hairstylist record);

    int insertSelective(Hairstylist record);

    List<Hairstylist> selectByExample(HairstylistExample example);

    Hairstylist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hairstylist record, @Param("example") HairstylistExample example);

    int updateByExample(@Param("record") Hairstylist record, @Param("example") HairstylistExample example);

    int updateByPrimaryKeySelective(Hairstylist record);

    int updateByPrimaryKey(Hairstylist record);
}