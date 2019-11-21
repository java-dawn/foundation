package com.study.foundation.dao2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * delv_constant
 * @author 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConstantPo implements Serializable {
    private Long id;

    /**
     * 常量类型
     */
    private String constantType;

    /**
     * 常量值
     */
    private String constantValue;

    /**
     * 常量释义
     */
    private String constantName;

    /**
     * 常量所属机构
     */
    private String orgCode;

    /**
     * @description  常量唯一键
     **/
    private String constantUniqueKey;

    private static final long serialVersionUID = 1L;
}