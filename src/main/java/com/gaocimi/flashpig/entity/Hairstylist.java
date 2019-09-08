package com.gaocimi.flashpig.entity;

import java.util.Date;

public class Hairstylist {
    private Integer id;

    private String content;

    private String city;

    private String district;

    private String address;

    private Double longitude;

    private Double latitude;

    private String shopName;

    private String hairstylistName;

    private String availableTime;

    private String attention;

    private Double point;

    private String imageList;

    private Date createTime;

    private Integer orderSum;

    private Double rankValue;

    public Hairstylist(Integer id, String content, String city, String district, String address, Double longitude, Double latitude, String shopName, String hairstylistName, String availableTime, String attention, Double point, String imageList, Date createTime, Integer orderSum, Double rankValue) {
        this.id = id;
        this.content = content;
        this.city = city;
        this.district = district;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.shopName = shopName;
        this.hairstylistName = hairstylistName;
        this.availableTime = availableTime;
        this.attention = attention;
        this.point = point;
        this.imageList = imageList;
        this.createTime = createTime;
        this.orderSum = orderSum;
        this.rankValue = rankValue;
    }

    public Hairstylist() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getHairstylistName() {
        return hairstylistName;
    }

    public void setHairstylistName(String hairstylistName) {
        this.hairstylistName = hairstylistName == null ? null : hairstylistName.trim();
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime == null ? null : availableTime.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList == null ? null : imageList.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Integer orderSum) {
        this.orderSum = orderSum;
    }

    public Double getRankValue() {
        return rankValue;
    }

    public void setRankValue(Double rankValue) {
        this.rankValue = rankValue;
    }
}