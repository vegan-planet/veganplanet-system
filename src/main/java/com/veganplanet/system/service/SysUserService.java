package com.veganplanet.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.veganplanet.system.domain.entity.SysUser;
import com.veganplanet.system.domain.vo.SysUserVO;

/**
 * description
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:51
 */
public interface SysUserService extends IService<SysUser> {

    SysUser getSysUserInfo(SysUserVO sysUserVO);
}
