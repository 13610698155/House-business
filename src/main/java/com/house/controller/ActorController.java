package com.house.controller;

import com.github.pagehelper.PageInfo;
import com.house.entity.Actor;
import com.house.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 分支
 */
@RestController
@CrossOrigin
public class ActorController {

    @Autowired
    private ActorService actorService;

    /**
     * 经纪人列表
     */
    @RequestMapping("getActorList")
    public PageInfo<Actor> getHouseList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                        @RequestParam(value = "pageSize",defaultValue = "5") int pageSize){

        return actorService.getActorList(pageNum,pageSize);
    }
    /**
     * 增加经纪人
     */
    @RequestMapping("ActorInsert")
    public Object ActorInsert(@RequestBody Actor actor){

        return actorService.ActorInsert(actor);
    }
    /**
     *回显
     */
    @RequestMapping("ActorShow")
    public Object ActorShow(int id){

        return actorService.ActorShow(id);
    }
    /**
     * 删除
     */
    @RequestMapping("ActorDel")
    public Object ActorDel(String id){

        return actorService.ActorDel(id);
    }


}
