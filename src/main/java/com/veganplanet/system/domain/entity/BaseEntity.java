package com.veganplanet.system.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;

import java.time.LocalDateTime;

/**
 * description
 *
 * @date 2024/2/27 11:30
 */
public class BaseEntity {
    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;
    /**
     * 修改人
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
    /**
     * 删除标记，0未删除，1已删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private String delFlag;
}
