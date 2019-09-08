package com.gaocimi.flashpig.service;

import com.gaocimi.flashpig.entity.HairService;
import com.gaocimi.flashpig.entity.HairServiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
public interface IHairServiceService {
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