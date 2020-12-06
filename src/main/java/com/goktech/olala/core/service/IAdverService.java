package com.goktech.olala.core.service;

import com.goktech.olala.server.pojo.goods.Adver;

import java.util.List;

/**
 * @author sanming
 * @Classname IAdverService
 * @Description TODO
 * @Date 2020/12/1
 */
public interface IAdverService {
    List<Adver> selectAll();
}
