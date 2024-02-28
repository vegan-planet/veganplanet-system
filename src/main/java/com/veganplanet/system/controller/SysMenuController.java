package com.veganplanet.system.controller;

import com.veganplanet.common.core.auth.Login;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.domain.vo.SysMenuQueryVO;
import com.veganplanet.system.service.application.SysMenuQueryService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *系统菜单管理
 */
@Login
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Resource
    private SysMenuQueryService sysMenuQueryService;

    /**
     * <p>菜单列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    @PostMapping("/getSysMenuPageList")
    public Res getSysMenuPageList(@RequestBody @Valid SysMenuQueryVO sysMenuQueryVO) {
        return sysMenuQueryService.getSysMenuPageList(sysMenuQueryVO);
    }
}
