package com.gaocimi.flashpig.dao;

import com.gaocimi.flashpig.entity.HairService;
import com.gaocimi.flashpig.entity.HairServiceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * @author liyutg
 * @date 2019/6/12 2:15
 * @description
 */
@Mapper
@Component
public interface HairServiceMapper {
    int countByExample(HairServiceExample example);

    int deleteByExample(HairServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HairService record);

    int insertSelective(HairService record);

    List<HairService> selectByExample(HairServiceExample example);

    HairService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HairService record, @Param("example") HairServiceExample example);

    int updateByExample(@Param("record") HairService record, @Param("example") HairServiceExample example);

    int updateByPrimaryKeySelective(HairService record);

    int updateByPrimaryKey(HairService record);
}