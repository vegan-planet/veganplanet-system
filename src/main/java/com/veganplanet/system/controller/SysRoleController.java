package com.veganplanet.system.controller;

import com.veganplanet.common.core.auth.Login;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.domain.vo.SysRoleQueryVO;
import com.veganplanet.system.service.application.SysRoleQueryService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *系统用户角色管理
 */
@Login
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Resource
    private SysRoleQueryService sysRoleQueryService;

    /**
    * <p>角色列表分页条件查询</p>
    * @date 2024/2/28 16:28
    * @param
    * @return
    */
    @PostMapping("/getSysRolePageList")
    public Res getSysRolePageList(@RequestBody @Valid SysRoleQueryVO sysRoleQueryVO) {
        return sysRoleQueryService.getSysRolePageList(sysRoleQueryVO);
    }

}
