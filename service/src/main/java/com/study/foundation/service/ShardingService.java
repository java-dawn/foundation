package com.study.foundation.service;

import com.alibaba.fastjson.JSONObject;
import com.study.foundation.dao.mapper.*;
import com.study.foundation.dao.model.*;
import com.zhilingsd.base.snowflake.client.SnowFlakeSerial;
import com.zhilingsd.base.snowflake.common.SnowFlakeEntityEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author yuboliang
 * @date 2019/4/29
 */
@Slf4j
@Service
public class ShardingService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private AllMapper allMapper;

    @Autowired
    private TimeShardingMapper timeShardingMapper;

    @Autowired
    private NormalTableMapper normalTableMapper;

    @Autowired
    private SnowFlakeSerial snowFlakeSerial;

    public Long query() {
        for (int i = 0; i < 10; i++) {
            Order orders = orderMapper.selectByPrimaryKey(Long.parseLong(i + ""));
            log.info(JSONObject.toJSONString(orders));
        }

        return 0L;
    }

    public Long add() {
        for (int i = 0; i < 100; i++) {
            Order order = new Order();
            Long orderId = Long.parseLong(i + 1 + "");
            order.setOrderId(orderId);
            order.setAddressId(1L);
            order.setUserId(1);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrderItemId(snowFlakeSerial.getLongSerialNum(SnowFlakeEntityEnum.CALL_MANAGE));
            orderItem.setOrderId(orderId);
            orderItem.setUserId(1);

            OrderItem orderItem2 = new OrderItem();
            orderItem2.setOrderItemId(snowFlakeSerial.getLongSerialNum());
            orderItem2.setOrderId(orderId);
            orderItem2.setUserId(1);

            orderMapper.insert(order);
            orderItemMapper.insert(orderItem);
            orderItemMapper.insert(orderItem2);
        }

        return 0L;
    }

    public void addAllTable() {
        for (int i = 0; i < 3; i++) {
            All all = new All();
            all.setId(i);
            all.setName(i * i + "");

            allMapper.insert(all);
        }
    }


    public Long addTimeSharding() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            TimeSharding timeSharding = new TimeSharding();
            timeSharding.setId(i);
            timeSharding.setCreateTime(new Date());

            Thread.sleep(1000);

            timeShardingMapper.insert(timeSharding);
        }

        return 0L;
    }

    public void addNormal() {
        for (int i = 0; i < 10; i++) {
            NormalTable normalTable = new NormalTable();
            normalTable.setName(i * i + "");

            normalTableMapper.insert(normalTable);
        }
    }
}
