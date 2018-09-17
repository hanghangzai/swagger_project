package com.lh.swag.service.impl;

import com.lh.swag.dao.RestTestDao;
import com.lh.swag.service.RestTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author lihang
 * @Package com.lh.swag.service.impl
 * @date 2018/9/1310:07
 */
@Service("restTestService")
public class RestTestServiceImpl implements RestTestService {

    public final Logger logger = LoggerFactory.getLogger(RestTestServiceImpl.class);

    @Autowired
    private RestTestDao restTestDao;

    @Override
    public Map<String, Object> testMap(String id) {
        logger.info("testMap - service");
        return restTestDao.testMap(id);
    }
}
