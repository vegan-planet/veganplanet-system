package com.veganplanet.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.veganplanet.system.domain.entity.SysMenu;
import com.veganplanet.system.domain.vo.SysMenuQueryVO;
import com.veganplanet.system.mapper.SysMenuMapper;
import com.veganplanet.system.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 菜单服务实现
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:52
 */
@Slf4j
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    /**
     * <p>菜单列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    @Override
    public IPage<SysMenu> getSysMenuPageList(SysMenuQueryVO sysMenuQueryVO) {
        Page<SysMenu> pages = new Page<>(sysMenuQueryVO.getPageNum(), sysMenuQueryVO.getPageSize());
        LambdaQueryWrapper<SysMenu> sysMenuLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysMenuLambdaQueryWrapper.like(Objects.nonNull(sysMenuQueryVO.getMenuName()), SysMenu::getMenuName, sysMenuQueryVO.getMenuName());
        return this.page(pages,sysMenuLambdaQueryWrapper);
    }
}
