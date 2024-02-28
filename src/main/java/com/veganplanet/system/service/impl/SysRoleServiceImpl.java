package com.veganplanet.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.veganplanet.system.domain.entity.SysRole;
import com.veganplanet.system.domain.vo.SysRoleQueryVO;
import com.veganplanet.system.mapper.SysRoleMapper;
import com.veganplanet.system.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 角色服务实现
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:52
 */
@Slf4j
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    /**
     * <p>角色列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    @Override
    public IPage<SysRole> getSysRolePageList(SysRoleQueryVO sysRoleQueryVO) {
        Page<SysRole> pages = new Page<>(sysRoleQueryVO.getPageNum(), sysRoleQueryVO.getPageSize());
        LambdaQueryWrapper<SysRole> sysRoleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysRoleLambdaQueryWrapper.like(Objects.nonNull(sysRoleQueryVO.getRoleName()), SysRole::getRoleName, sysRoleQueryVO.getRoleName());
        return this.page(pages,sysRoleLambdaQueryWrapper);
    }
}
