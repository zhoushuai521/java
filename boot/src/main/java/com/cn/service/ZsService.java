package com.cn.service;

import com.cn.entity.Zs;
import com.cn.mapper.ZsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: ZsService
 *
 * @Description:
 * @Author: zhoushuai
 * @Date: 2020-04-18  16:39
 */
@Service
public class ZsService {

    @Autowired
    private ZsMapper zm;

    public Zs getId(Integer id){

        return zm.getId(id);
    }
}
