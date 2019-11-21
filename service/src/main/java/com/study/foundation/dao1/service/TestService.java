package com.study.foundation.dao1.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.study.foundation.dao1.mapper.BillInfoMapper;
import com.study.foundation.dao1.model.BillInfo;
import com.study.foundation.dao1.model.BillInfoExample;
import com.study.foundation.dao2.mapper.ConstantPoMapper;
import com.study.foundation.dao2.model.ConstantPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@Slf4j
@Service
public class TestService {
    @Autowired
    private BillInfoMapper billInfoMapper;
    @Autowired
    private ConstantPoMapper constantPoMapper;

    public Long test() {
        BillInfoExample example = new BillInfoExample();
        example.createCriteria().andIdEqualTo(875341262893842433L);
        List<BillInfo> billInfos = billInfoMapper.selectByExample(example);
        log.info(JSONObject.toJSONString(billInfos));

        ConstantPo constantPo = new ConstantPo();
        constantPo.setConstantType("test");
        constantPo.setConstantName("test");
        constantPo.setConstantValue("test");
        constantPo.setOrgCode("123");
        constantPo.setConstantUniqueKey("1");
        constantPoMapper.insertSelective(constantPo);
        return 0L;
    }
}
