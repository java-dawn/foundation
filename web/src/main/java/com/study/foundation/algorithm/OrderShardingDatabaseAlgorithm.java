package com.study.foundation.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public final class OrderShardingDatabaseAlgorithm implements PreciseShardingAlgorithm<Long> {
    
    @Override
    public String doSharding(final Collection<String> databaseNames, final PreciseShardingValue<Long> shardingValue) {
        String databaseRoute = shardingValue.getValue() % 6 / 3 + "";
        for (String each : databaseNames) {
            if (each.endsWith(databaseRoute)) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
