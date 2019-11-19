package com.xchong.boot.controller;

import com.xchong.boot.entity.RsInventoryStatus;
import com.xchong.boot.mapper.RsInventoryStatusMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xchong
 * @create 2019-11-15 18:28
 * description:
 */
@Api(description="测试入口api" , tags="api")
@RestController
public class TestController {

    @Autowired
    private RsInventoryStatusMapper rsInventoryStatusMapper;

    @ApiOperation(value="获取库存流水详细信息", notes="根据库存id获取流水")
    @ApiImplicitParam(name = "inventoryId", value = "库存ID", required = true, dataType = "Integer", paramType = "path")
    @GetMapping("/findInventoryStatus")
    public List<RsInventoryStatus> findAllStudent(Integer inventoryId) {
        List<RsInventoryStatus> list = rsInventoryStatusMapper.findAll();
        return list;
    }
}
