package com.house.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.entity.City;
import com.house.entity.House;
import com.house.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseMapper houseMapper;

    /**
     * 房屋列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<House> getHouseList(int pageNum, int pageSize,House house) {
        PageHelper.startPage(pageNum,pageSize);
        List<House> houseList = houseMapper.getHouseList(house);

        return new PageInfo<>(houseList);
    }

    /**
     * 地区
     * @return
     */
    @Override
    public List<City> getCityList() {

        return houseMapper.getCityList();
    }

    /**
     * 类型
     * @return
     */
    @Override
    public List<City> getTypeList() {

        return houseMapper.getTypeList();
    }

    /**
     * 发布编辑
     * @param house
     * @return
     */
    @Override
    public int HouseInsert(House house) {

        if (house.getId()!=null){
            return houseMapper.HouseUpdate(house);
        }
        return houseMapper.HouseInsert(house);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @Override
    public House HouseShow(int id) {

        return houseMapper.HouseShow(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int HouseDel(String id) {

        return houseMapper.HouseDel(id);
    }
}
