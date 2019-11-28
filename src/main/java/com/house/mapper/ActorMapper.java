package com.house.mapper;

import com.house.entity.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ActorMapper {

    /**
     * 列表
     */
    List<Actor> getActorList();
    /**
     * 增加经纪人
     */
    int ActorInsert(Actor actor);
    /**
     * 增加经纪人
     */
    int ActorUpdate(Actor actor);
    /**
     * 回显
     */
    Actor ActorShow(int id);
    /**
     * 删除
     */
    int ActorDel(@Param("id") String id);

}
