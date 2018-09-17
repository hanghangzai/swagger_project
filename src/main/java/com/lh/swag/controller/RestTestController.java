package com.lh.swag.controller;

import com.lh.swag.service.RestTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author lihang --rest接口
 * @Package com.lh.swag.controller
 * @date 2018/9/310:35
 */
@Api(value="Rest测试模块")
@RestController
@RequestMapping("/RestTest")
public class RestTestController {

    private final Logger logger = LoggerFactory.getLogger(RestTestController.class);

    @Autowired
    private RestTestService restTestService;

    @ApiOperation(value = "测试rest接口")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(){
        logger.info("RestTest");
        return "RestTest";
    }
    @ApiOperation(value = "根据用户id查询数据")
    @ApiImplicitParam(paramType = "query", name = "id",dataType = "String", required = true,value = "id值")
    @RequestMapping(value = "/testMap",method = RequestMethod.POST)
    public Map<String, Object> testMap(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        return restTestService.testMap(id);
    }
}
