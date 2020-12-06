package com.goktech.olala.core.service;

import com.goktech.olala.server.pojo.goods.Active;

import java.util.List;

/**
 * @author sanming
 * @Classname IActiveService
 * @Description TODO
 * @Date 2020/12/1
 */
public interface IActiveService {
    List<Active> selectAll();
}
