package com.gaocimi.flashpig.service;

import com.gaocimi.flashpig.entity.RecordHairstylisToUser;
import com.gaocimi.flashpig.entity.RecordHairstylisToUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
public interface IRecordHairstylisToUserService {
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