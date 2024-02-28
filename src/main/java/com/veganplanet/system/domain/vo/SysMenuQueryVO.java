package com.veganplanet.system.domain.vo;

import com.veganplanet.common.core.request.model.BasePageParam;
import lombok.Data;

import java.io.Serializable;

/**
 * description
 *
 * @date 2024/2/28 16:53
 */
@Data
public class SysMenuQueryVO extends BasePageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
    private Long menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单权限标识
     */
    private String permission;

    /**
     * 父菜单ID
     */
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
    private String menuType;
}
