package com.study.foundation.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public final class TimeShardingTableAlgorithm implements PreciseShardingAlgorithm<Date> {
    
    @Override
    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<Date> shardingValue) {
        String dateStr = "2019-11-25 11:53:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            Date createTime = shardingValue.getValue();
            String route = createTime.before(date) ? "0" : "1";
            System.out.println("createTime = " + createTime);

            for (String each : tableNames) {
                if (each.endsWith(route)) {
                    return each;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


        throw new UnsupportedOperationException();
    }
}
