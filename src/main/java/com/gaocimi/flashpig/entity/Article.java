package com.gaocimi.flashpig.entity;

import java.util.Date;
/**
 * @author liyutg
 * @date 2019/6/12 2:16
 * @description
 */
public class Article {
    private Integer id;

    private Double articlePrice;

    private String introduction;

    private Date createTime;

    private String group;

    private String skill;

    private String imageList;

    public Article(Integer id, Double articlePrice, String introduction, Date createTime, String group, String skill, String imageList) {
        this.id = id;
        this.articlePrice = articlePrice;
        this.introduction = introduction;
        this.createTime = createTime;
        this.group = group;
        this.skill = skill;
        this.imageList = imageList;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(Double articlePrice) {
        this.articlePrice = articlePrice;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList == null ? null : imageList.trim();
    }
}