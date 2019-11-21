package com.study.foundation.service;

import com.alibaba.fastjson.JSONObject;
import com.study.foundation.dao.mapper.OrderItemMapper;
import com.study.foundation.dao.mapper.OrderMapper;
import com.study.foundation.dao.model.Order;
import com.study.foundation.dao.model.OrderExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@Slf4j
@Service
public class TestService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    public Long test() {
        OrderExample example = new OrderExample();
        example.createCriteria().andOrderIdEqualTo(1L);
        List<Order> orders = orderMapper.selectByExample(example);
        log.info(JSONObject.toJSONString(orders));

        return 0L;
    }
}
