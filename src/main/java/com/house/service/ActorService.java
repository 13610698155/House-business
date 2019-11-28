package com.house.service;

import com.github.pagehelper.PageInfo;
import com.house.entity.Actor;

public interface ActorService {

    /**
     * 经纪人
     */
    PageInfo<Actor> getActorList(int pageNum,int pageSize);
    /**
     * 增加经纪人
     */
    int ActorInsert(Actor actor);
    /**
     * 回显
     */
    Actor ActorShow(int id);
    /**
     * 删除
     */
    int ActorDel(String id);

}
