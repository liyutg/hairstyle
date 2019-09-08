package com.gaocimi.flashpig.entity;

import java.util.Date;

public class UserOrder {
    private Integer id;

    private Integer orderNum;

    private Integer articleId;

    private Integer serviceId;

    private Integer createBy;

    private Date createTime;

    private Double orderPrice;

    private Integer type;

    private Integer state;

    private Date bookTime;

    public UserOrder(Integer id, Integer orderNum, Integer articleId, Integer serviceId, Integer createBy, Date createTime, Double orderPrice, Integer type, Integer state, Date bookTime) {
        this.id = id;
        this.orderNum = orderNum;
        this.articleId = articleId;
        this.serviceId = serviceId;
        this.createBy = createBy;
        this.createTime = createTime;
        this.orderPrice = orderPrice;
        this.type = type;
        this.state = state;
        this.bookTime = bookTime;
    }

    public UserOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }
}