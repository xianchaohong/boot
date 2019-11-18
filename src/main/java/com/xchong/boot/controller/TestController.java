package com.xchong.boot.controller;

import com.xchong.boot.entity.RsInventoryStatus;
import com.xchong.boot.mapper.RsInventoryStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xchong
 * @create 2019-11-15 18:28
 * description:
 */
@RestController
public class TestController {

    @Autowired
    private RsInventoryStatusMapper rsInventoryStatusMapper;

    @GetMapping("/findAll")
    public List<RsInventoryStatus> findAllStudent() {
        List<RsInventoryStatus> list = rsInventoryStatusMapper.findAll();
        return list;
    }
}
