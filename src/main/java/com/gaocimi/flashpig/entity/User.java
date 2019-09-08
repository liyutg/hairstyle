package com.gaocimi.flashpig.entity;

public class User {
    private Integer id;

    private String name;

    private Integer sex;

    private String openid;

    private Integer type;

    private String phoneNum;

    private Integer state;

    private String province;

    private String city;

    private String collections;

    public User(Integer id, String name, Integer sex, String openid, Integer type, String phoneNum, Integer state, String province, String city, String collections) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.openid = openid;
        this.type = type;
        this.phoneNum = phoneNum;
        this.state = state;
        this.province = province;
        this.city = city;
        this.collections = collections;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCollections() {
        return collections;
    }

    public void setCollections(String collections) {
        this.collections = collections == null ? null : collections.trim();
    }
}