package com.house.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.entity.Actor;
import com.house.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService{

    @Autowired
    private ActorMapper actorMapper;

    /**
     * 经纪人
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Actor> getActorList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Actor> actorList = actorMapper.getActorList();

        return new PageInfo<>(actorList);
    }

    /**
     * 增加经纪人
     * @param actor
     * @return
     */
    @Override
    public int ActorInsert(Actor actor) {
        if (actor.getId()!=null){
            return actorMapper.ActorUpdate(actor);
        }
        return actorMapper.ActorInsert(actor);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @Override
    public Actor ActorShow(int id) {

        return actorMapper.ActorShow(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int ActorDel(String id) {

        return actorMapper.ActorDel(id);
    }
}
