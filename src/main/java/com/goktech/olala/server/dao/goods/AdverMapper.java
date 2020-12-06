package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Adver;
import java.util.List;

public interface AdverMapper {
    int deleteByPrimaryKey(Short adverId);

    int insert(Adver record);

    Adver selectByPrimaryKey(Short adverId);

    List<Adver> selectAll();

    int updateByPrimaryKey(Adver record);
}