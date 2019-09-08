package com.gaocimi.flashpig.service.impl;

import com.gaocimi.flashpig.dao.HairstylistMapper;
import com.gaocimi.flashpig.entity.Hairstylist;
import com.gaocimi.flashpig.entity.HairstylistExample;
import com.gaocimi.flashpig.service.IHairstylistService;
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
public class HairstylistServiceImpl implements IHairstylistService {

    @Autowired
    HairstylistMapper hairstylistMapper;

    @Override
    public int countByExample(HairstylistExample example) {
        return hairstylistMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(HairstylistExample example) {
        return hairstylistMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hairstylistMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Hairstylist record) {
        return hairstylistMapper.insert(record);
    }

    @Override
    public int insertSelective(Hairstylist record) {
        return hairstylistMapper.insertSelective(record);
    }

    @Override
    public List<Hairstylist> selectByExample(HairstylistExample example) {
        return hairstylistMapper.selectByExample(example);
    }

    @Override
    public Hairstylist selectByPrimaryKey(Integer id) {
        return hairstylistMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Hairstylist record, HairstylistExample example) {
        return hairstylistMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Hairstylist record, HairstylistExample example) {
        return hairstylistMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Hairstylist record) {
        return hairstylistMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Hairstylist record) {
        return hairstylistMapper.updateByPrimaryKey(record);
    }
}