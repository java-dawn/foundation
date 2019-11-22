package com.study.foundation.web;

import com.study.foundation.service.ShardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@RestController
public class ShardingController {

    @Autowired
    private ShardingService shardingService;

    @RequestMapping("/query")
    public Long query() {
        return shardingService.query();
    }

    @RequestMapping("/add")
    public Long add() {
        return shardingService.add();
    }

    @RequestMapping("/addTimeSharding")
    public Long addTimeSharding() throws InterruptedException {
        return shardingService.addTimeSharding();
    }

}
