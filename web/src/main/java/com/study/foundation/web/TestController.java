package com.study.foundation.web;

import com.study.foundation.dao.mapper.MythOrderServiceMapper;
import com.study.foundation.dao.model.MythOrderServiceExample;
import com.study.foundation.dao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Long test() {
        return testService.test();
    }

    @RequestMapping("/testStr")
    public String testStr() {
        return "1123";
    }
}
