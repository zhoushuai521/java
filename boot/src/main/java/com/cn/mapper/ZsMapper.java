package com.cn.mapper;

import com.cn.entity.Zs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Title: ZsMapper
 *
 * @Description:
 * @Author: zhoushuai
 * @Date: 2020-04-18  16:37
 */
@Mapper
@Repository
public interface ZsMapper {

    @Select("select * from zs where id=#{id}")
    Zs getId(Integer id);
}
