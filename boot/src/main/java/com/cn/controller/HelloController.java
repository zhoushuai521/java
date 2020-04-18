package com.cn.controller;

import com.cn.entity.Stu;
import com.cn.entity.Zs;
import com.cn.mapper.StuMapper;
import com.cn.service.ZsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Title: HelloController
 *
 * @Description:
 * @Author: zhoushuai
 * @Date: 2020-04-17  22:38
 */
@RestController
public class HelloController {

    @Autowired
    private ZsService zs;

    @Autowired
    private StuMapper sm;

    @RequestMapping("/getHello")
    public String getHello() {
        return "hello zs";
    }

    @RequestMapping("/getXiaoyu")
    public String getXiaoyu() {
        return "小雨";
    }

    @PostMapping("/getId")
    public Zs getId(Integer id) {
        return zs.getId(id);
    }

    @PostMapping("/getById")
    public Stu getById(Integer id) {
        return sm.selectByPrimaryKey(id);
    }
}
