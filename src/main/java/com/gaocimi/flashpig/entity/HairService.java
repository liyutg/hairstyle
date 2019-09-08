package com.gaocimi.flashpig.entity;
/**
 * @author liyutg
 * @date 2019/6/12 2:16
 * @description
 */
public class HairService {
    private Integer id;

    private String serviceName;

    private Double price;

    private Integer type;

    private Integer createby;

    public HairService(Integer id, String serviceName, Double price, Integer type, Integer createby) {
        this.id = id;
        this.serviceName = serviceName;
        this.price = price;
        this.type = type;
        this.createby = createby;
    }

    public HairService() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }
}