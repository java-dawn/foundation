package com.study.foundation.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public final class OrderShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {
    
    @Override
    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<Long> shardingValue) {
        for (String each : tableNames) {
            if (each.endsWith(shardingValue.getValue() % 6 + "")) {
                return each;
            }
        }
        return null;
    }
}
