/**
 * Software License Declaration.
 * <p>
 * zhilingsd.com, Co,. Ltd.
 * Copyright © 2019 All Rights Reserved.
 * <p>
 * Copyright Notice
 * This documents is provided to zhilingsd contracting agent or authorized programmer only.
 * This source code is written and edited by zhilingsd Co,.Ltd Inc specially for financial
 * business contracting agent or authorized cooperative company, in order to help them to
 * install, programme or central control in certain project by themselves independently.
 * <p>
 * Disclaimer
 * If this source code is needed by the one neither contracting agent nor authorized programmer
 * during the use of the code, should contact to zhilingsd Co,. Ltd Inc, and get the confirmation
 * and agreement of three departments managers  - Research Department, Marketing Department and
 * Production Department.Otherwise zhilingsd will charge the fee according to the programme itself.
 * <p>
 * Any one,including contracting agent and authorized programmer,cannot share this code to
 * the third party without the agreement of wandaph. If Any problem cannot be solved in the
 * procedure of programming should be feedback to zhilingsd Co,. Ltd Inc in time, Thank you!
 */
package com.study.foundation.config;

import com.zhilingsd.base.snowflake.client.SnowFlakeSerial;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * 雪花ID
 * @author ZhangRong
 * @version Id: com.zhilingsd.collection.agent.dal.configuration.SnowFlakeConfig, v 0.1 2019/5/1 19:06 ZhangRong Exp $$
 */
@Configuration
public class SnowFlakeConfig {
    @Value("${snowflake.servers}")
    private String snowflakeServers;
    @Value("${snowflake.timeout}")
    private Integer snowflakeTimeout;

    @Bean
    public SnowFlakeSerial snowFlakeSerial() throws IOException {
        return new SnowFlakeSerial(snowflakeServers, snowflakeTimeout);
    }
}
