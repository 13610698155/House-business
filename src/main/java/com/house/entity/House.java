package com.house.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class House implements Serializable {
    private Integer id;
    private String name;
    private String img;
    private Integer city_id;
    private String content;
    private Integer hall;
    private Integer room;
    private Integer defend;
    private BigDecimal price;
    private Integer status;
    private Integer type_id;
    private Integer appraise_id;
    private String cityName;
    private String typeName;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", city_id=" + city_id +
                ", content='" + content + '\'' +
                ", hall=" + hall +
                ", room=" + room +
                ", defend=" + defend +
                ", price=" + price +
                ", status=" + status +
                ", type_id=" + type_id +
                ", appraise_id=" + appraise_id +
                ", cityName='" + cityName + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
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
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getHall() {
        return hall;
    }

    public void setHall(Integer hall) {
        this.hall = hall;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getDefend() {
        return defend;
    }

    public void setDefend(Integer defend) {
        this.defend = defend;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getAppraise_id() {
        return appraise_id;
    }

    public void setAppraise_id(Integer appraise_id) {
        this.appraise_id = appraise_id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public House() {
    }

    public House(Integer id, String name, String img, Integer city_id, String content, Integer hall, Integer room, Integer defend, BigDecimal price, Integer status, Integer type_id, Integer appraise_id, String cityName, String typeName) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.city_id = city_id;
        this.content = content;
        this.hall = hall;
        this.room = room;
        this.defend = defend;
        this.price = price;
        this.status = status;
        this.type_id = type_id;
        this.appraise_id = appraise_id;
        this.cityName = cityName;
        this.typeName = typeName;
    }
}
