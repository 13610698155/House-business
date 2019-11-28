package com.house.controller;

import com.github.pagehelper.PageInfo;
import com.house.entity.House;
import com.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     * 房屋列表
     */
    @RequestMapping("getHouseList")
    public PageInfo<House> getHouseList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                        @RequestParam(value = "pageSize",defaultValue = "5") int pageSize,
                                        House house){

        return houseService.getHouseList(pageNum,pageSize,house);
    }

    /**
     * 地区
     * @return
     */
    @RequestMapping("getCityList")
    public Object getCityList(){

        return houseService.getCityList();
    }

    /**
     * 类型
     * @return
     */
    @RequestMapping("getTypeList")
    public Object getTypeList(){

        return houseService.getTypeList();
    }

    /**
     * 发布
     */
    @RequestMapping("HouseInsert")
    public Object HouseInsert(@RequestBody House house){

        return houseService.HouseInsert(house);
    }
    /**
     * 编辑
     */
    @RequestMapping("HouseShow")
    public Object HouseShow(int id){

        return houseService.HouseShow(id);
    }
    /**
     * 删除
     */
    @RequestMapping("HouseDel")
    public Object HouseDel(String id){

        return houseService.HouseDel(id);
    }

}
