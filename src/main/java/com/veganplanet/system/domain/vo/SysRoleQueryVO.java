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
public class SysRoleQueryVO extends BasePageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *角色ID
     */
    private Long roleId;
    /**
     *角色名称
     */
    private String roleName;
    /**
     *角色标识
     */
    private String roleCode;
}
