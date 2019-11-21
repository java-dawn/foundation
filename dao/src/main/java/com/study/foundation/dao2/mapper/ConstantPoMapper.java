package com.study.foundation.dao2.mapper;

import com.study.foundation.dao2.model.ConstantPo;
import com.study.foundation.dao2.model.ConstantPoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConstantPoMapper {

    /**
     * @description  批量保存常量信息 去重
     **/
    int saveConstantSet(@Param("list") List<ConstantPo> constantPoList);

    /**
     * @description 保存常量信息
     **/
    int saveConstantInfo(ConstantPo po);

    long countByExample(ConstantPoExample example);

    int deleteByExample(ConstantPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConstantPo record);

    int insertSelective(ConstantPo record);

    List<ConstantPo> selectByExample(ConstantPoExample example);

    ConstantPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConstantPo record, @Param("example") ConstantPoExample example);

    int updateByExample(@Param("record") ConstantPo record, @Param("example") ConstantPoExample example);

    int updateByPrimaryKeySelective(ConstantPo record);

    int updateByPrimaryKey(ConstantPo record);
}