package com.gaocimi.flashpig.service.impl;

/**
 * @author liyutg
 * @date 2019/6/12 2:17
 * @description
 */
import com.gaocimi.flashpig.dao.ArticleMapper;
import com.gaocimi.flashpig.entity.Article;
import com.gaocimi.flashpig.entity.ArticleExample;
import com.gaocimi.flashpig.service.IArticleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public int countByExample(ArticleExample example) {
        return articleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArticleExample example) {
        return articleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public List<Article> selectByExample(ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @Override
    public Article selectByPrimaryKey(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Article record, ArticleExample example) {
        return articleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Article record, ArticleExample example) {
        return articleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return articleMapper.updateByPrimaryKey(record);
    }
}