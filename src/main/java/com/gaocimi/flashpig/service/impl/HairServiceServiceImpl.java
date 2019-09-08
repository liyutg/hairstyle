package com.gaocimi.flashpig.service.impl;

import com.gaocimi.flashpig.dao.HairServiceMapper;
import com.gaocimi.flashpig.entity.HairService;
import com.gaocimi.flashpig.entity.HairServiceExample;
import com.gaocimi.flashpig.entity.HairService;
import com.gaocimi.flashpig.entity.HairServiceExample;
import com.gaocimi.flashpig.service.IHairServiceService;
import com.gaocimi.flashpig.service.IHairServiceService;
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
public class HairServiceServiceImpl implements IHairServiceService {

    @Autowired
    HairServiceMapper hairServiceMapper;

    @Override
    public int countByExample(HairServiceExample example) {
        return hairServiceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(HairServiceExample example) {
        return hairServiceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hairServiceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HairService record) {
        return hairServiceMapper.insert(record);
    }

    @Override
    public int insertSelective(HairService record) {
        return hairServiceMapper.insertSelective(record);
    }

    @Override
    public List<HairService> selectByExample(HairServiceExample example) {
        return hairServiceMapper.selectByExample(example);
    }

    @Override
    public HairService selectByPrimaryKey(Integer id) {
        return hairServiceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(HairService record, HairServiceExample example) {
        return hairServiceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(HairService record, HairServiceExample example) {
        return hairServiceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(HairService record) {
        return hairServiceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HairService record) {
        return hairServiceMapper.updateByPrimaryKey(record);
    }
}