package com.veganplanet.system.service.application;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.veganplanet.common.core.response.BasePageResult;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.domain.entity.SysMenu;
import com.veganplanet.system.domain.vo.SysMenuQueryVO;
import com.veganplanet.system.service.SysMenuService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 系统菜单查询
 *
 * @date 2024/1/13 13:33
 */
@Slf4j
@Service
public class SysMenuQueryService {
    @Resource
    private SysMenuService sysMenuService;

    /**
     * <p>菜单列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    public Res getSysMenuPageList(SysMenuQueryVO sysMenuQueryVO) {
        IPage<SysMenu> sysMenuIPage= this.sysMenuService.getSysMenuPageList(sysMenuQueryVO);
        return Res.ok(BasePageResult.newInstance(sysMenuIPage,sysMenuIPage.getRecords()));
    }
}
