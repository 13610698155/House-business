package com.house.entity;

import java.io.Serializable;

public class Actor implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String college;
    private String phone;
    private String img;
    private String hname;

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", phone='" + phone + '\'' +
                ", img='" + img + '\'' +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Actor() {
    }

    public Actor(Integer id, String name, Integer age, String college, String phone, String img) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.college = college;
        this.phone = phone;
        this.img = img;
    }
}
