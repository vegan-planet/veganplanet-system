package com.veganplanet.system.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

/**
 * 菜单权限表
 *
 * @date 2024/2/27 11:13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_menu")
public class SysMenu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
    @TableId(value = "menu_id", type = IdType.ASSIGN_ID)
    private Long menuId;
    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    private String menuName;
    /**
     * 菜单权限标识
     */
    private String permission;

    /**
     * 父菜单ID
     */
    @NotNull(message = "菜单父ID不能为空")
    private Long parentId;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 前端路由标识路径，默认和 comment 保持一致 过期
     */
    private String path;

    /**
     * 菜单显示隐藏控制
     */
    private String visible;

    /**
     * 排序值
     */
    private Integer sortOrder;

    /**
     * 菜单类型 （0菜单 1按钮）
     */
    @NotNull(message = "菜单类型不能为空")
    private String menuType;
}
