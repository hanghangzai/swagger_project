package com.lh.swag.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lihang
 * @Package com.lh.swag.dao
 * @date 2018/9/1310:08
 */
@Component
public interface RestTestDao {

    Map<String, Object> testMap(@Param("id")String id);
}
