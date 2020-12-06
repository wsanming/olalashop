package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IAdverService;
import com.goktech.olala.server.dao.goods.AdverMapper;
import com.goktech.olala.server.pojo.goods.Adver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sanming
 * @Classname AdverServiceImp
 * @Description TODO
 * @Date 2020/12/1
 */

@Service
public class AdverServiceImp implements IAdverService {

    @Autowired
    AdverMapper adverMapper;

    @Override
    public List<Adver> selectAll() {
        List<Adver> advers = adverMapper.selectAll();
        return advers;
    }
}
