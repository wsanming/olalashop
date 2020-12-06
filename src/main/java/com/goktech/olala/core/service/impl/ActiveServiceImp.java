package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IActiveService;
import com.goktech.olala.server.dao.goods.ActiveMapper;
import com.goktech.olala.server.pojo.goods.Active;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sanming
 * @Classname ActiveServiceImp
 * @Description TODO
 * @Date 2020/12/1
 */
@Service
public class ActiveServiceImp implements IActiveService {

    @Autowired
    ActiveMapper activeMapper;

    @Override
    public List<Active> selectAll() {
        List<Active> actives = activeMapper.selectAll();
        return actives;
    }
}
