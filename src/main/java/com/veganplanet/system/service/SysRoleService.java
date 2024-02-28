package com.veganplanet.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.veganplanet.system.domain.entity.SysRole;
import com.veganplanet.system.domain.vo.SysRoleQueryVO;

/**
 * 角色接口
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:51
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * <p>角色列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    IPage<SysRole> getSysRolePageList(SysRoleQueryVO sysRoleQueryVO);
}
