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
        String dateStr = "2019-11-22 19:15:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            Date createTime = shardingValue.getValue();
            String route = createTime.before(date) ? "0" : "1";

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
