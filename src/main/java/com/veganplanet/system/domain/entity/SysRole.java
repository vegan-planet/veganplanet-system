package com.veganplanet.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;

/**
 * 角色表
 *
 * @date 2024/2/27 11:12
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")
public class SysRole extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     *角色ID
     */
    @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;
    /**
     *角色名称
     */
    @NotBlank(message = "角色名称不能为空")
    private String roleName;
    /**
     *角色标识
     */
    @NotBlank(message = "角色标识不能为空")
    private String roleCode;
    /**
     *角色描述
     */
    private String roleDesc;
}
