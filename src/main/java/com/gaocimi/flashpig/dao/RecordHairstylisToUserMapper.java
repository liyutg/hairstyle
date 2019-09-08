package com.gaocimi.flashpig.dao;

import com.gaocimi.flashpig.entity.RecordHairstylisToUser;
import com.gaocimi.flashpig.entity.RecordHairstylisToUserExample;
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
public interface RecordHairstylisToUserMapper {
    int countByExample(RecordHairstylisToUserExample example);

    int deleteByExample(RecordHairstylisToUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordHairstylisToUser record);

    int insertSelective(RecordHairstylisToUser record);

    List<RecordHairstylisToUser> selectByExample(RecordHairstylisToUserExample example);

    RecordHairstylisToUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordHairstylisToUser record, @Param("example") RecordHairstylisToUserExample example);

    int updateByExample(@Param("record") RecordHairstylisToUser record, @Param("example") RecordHairstylisToUserExample example);

    int updateByPrimaryKeySelective(RecordHairstylisToUser record);

    int updateByPrimaryKey(RecordHairstylisToUser record);
}