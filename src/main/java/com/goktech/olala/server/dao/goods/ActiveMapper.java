package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Active;
import java.util.List;

public interface ActiveMapper {
    int deleteByPrimaryKey(Short activitId);

    int insert(Active record);

    Active selectByPrimaryKey(Short activitId);

    List<Active> selectAll();

    int updateByPrimaryKey(Active record);
}