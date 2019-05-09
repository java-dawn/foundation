package com.study.foundation.dao.service;

import com.github.pagehelper.PageHelper;
import com.study.foundation.dao.mapper.MythOrderServiceMapper;
import com.study.foundation.dao.model.MythOrderService;
import com.study.foundation.dao.model.MythOrderServiceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@Service
public class TestService {
    @Autowired
    private MythOrderServiceMapper mythOrderServiceMapper;

    public Long test() {
        MythOrderServiceExample mythOrderServiceExample = new MythOrderServiceExample();
        PageHelper.offsetPage(1, 10);
        List<MythOrderService> mythOrderServices = mythOrderServiceMapper.selectByExample(mythOrderServiceExample);
        long l = mythOrderServices.size();
        return l;
    }
}
