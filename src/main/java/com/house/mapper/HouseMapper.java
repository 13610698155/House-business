package com.house.mapper;

import com.house.entity.City;
import com.house.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HouseMapper {

    /**
     * 列表
     */
    List<House> getHouseList(@Param("house") House house);
    /**
     *地区
     */
    List<City> getCityList();
    /**
     *类型
     */
    List<City> getTypeList();
    /**
     * 发布
     */
    int HouseInsert(House house);
    /**
     * 编辑
     */
    int HouseUpdate(House house);
    /**
     * 回显
     */
    House HouseShow(@Param("id") int id);
    /**
     * 删除
     */
    int HouseDel(@Param("id") String id);

}
