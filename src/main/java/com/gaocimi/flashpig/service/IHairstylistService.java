package com.gaocimi.flashpig.service;

import com.gaocimi.flashpig.entity.Hairstylist;
import com.gaocimi.flashpig.entity.HairstylistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
public interface IHairstylistService {
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