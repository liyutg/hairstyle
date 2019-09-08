package com.gaocimi.flashpig.service.impl;

import com.gaocimi.flashpig.dao.RecordHairstylisToUserMapper;
import com.gaocimi.flashpig.entity.RecordHairstylisToUser;
import com.gaocimi.flashpig.entity.RecordHairstylisToUserExample;
import com.gaocimi.flashpig.entity.RecordHairstylisToUser;
import com.gaocimi.flashpig.entity.RecordHairstylisToUserExample;
import com.gaocimi.flashpig.service.IRecordHairstylisToUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
@Service
public class RecordHairstylisToUserServiceImpl implements IRecordHairstylisToUserService {

    @Autowired
    RecordHairstylisToUserMapper recordHairstylisToUserMapper;

    @Override
    public int countByExample(RecordHairstylisToUserExample example) {
        return recordHairstylisToUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RecordHairstylisToUserExample example) {
        return recordHairstylisToUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordHairstylisToUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RecordHairstylisToUser record) {
        return recordHairstylisToUserMapper.insert(record);
    }

    @Override
    public int insertSelective(RecordHairstylisToUser record) {
        return recordHairstylisToUserMapper.insertSelective(record);
    }

    @Override
    public List<RecordHairstylisToUser> selectByExample(RecordHairstylisToUserExample example) {
        return recordHairstylisToUserMapper.selectByExample(example);
    }

    @Override
    public RecordHairstylisToUser selectByPrimaryKey(Integer id) {
        return recordHairstylisToUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(RecordHairstylisToUser record, RecordHairstylisToUserExample example) {
        return recordHairstylisToUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RecordHairstylisToUser record, RecordHairstylisToUserExample example) {
        return recordHairstylisToUserMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(RecordHairstylisToUser record) {
        return recordHairstylisToUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RecordHairstylisToUser record) {
        return recordHairstylisToUserMapper.updateByPrimaryKey(record);
    }
}