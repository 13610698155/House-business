package com.house.entity;

import java.io.Serializable;

public class Type implements Serializable {
    private Integer id;
    private String name;

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

    public Type(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type(Integer id) {
        this.id = id;
    }
}
