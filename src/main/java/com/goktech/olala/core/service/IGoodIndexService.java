package com.goktech.olala.core.service;

import com.goktech.olala.core.req.ReqGoodKey;
import com.goktech.olala.server.pojo.goods.Good;

import java.util.List;

/**
 * @author sanming
 * @Classname IGoodIndexService
 * @Description TODO
 * @Date 2020/12/4
 */
public interface IGoodIndexService {
    List<Good> selectByKey(ReqGoodKey goodKey);
}
