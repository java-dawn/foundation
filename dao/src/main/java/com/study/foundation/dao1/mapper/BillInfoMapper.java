package com.study.foundation.dao1.mapper;

import com.study.foundation.dao1.model.BillInfo;
import com.study.foundation.dao1.model.BillInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillInfoMapper {
    int countByExample(BillInfoExample example);

    int deleteByExample(BillInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillInfo record);

    int insertSelective(BillInfo record);

    List<BillInfo> selectByExample(BillInfoExample example);

    BillInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByExample(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByPrimaryKeySelective(BillInfo record);

    int updateByPrimaryKey(BillInfo record);
}