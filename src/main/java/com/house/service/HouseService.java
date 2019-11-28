package com.house.service;

import com.github.pagehelper.PageInfo;
import com.house.entity.City;
import com.house.entity.House;

import java.util.List;

public interface HouseService {

    /**
     * 列表
     */
    PageInfo<House> getHouseList(int pageNum,int pageSize,House house);

    /**
     *地区
     */
    List<City> getCityList();
    /**
     *类型
     */
    List<City> getTypeList();
    /**
     * 发布编辑
     */
    int HouseInsert(House house);
    /**
     * 回显
     */
    House HouseShow(int id);
    /**
     * 删除
     */
    int HouseDel(String id);


}
