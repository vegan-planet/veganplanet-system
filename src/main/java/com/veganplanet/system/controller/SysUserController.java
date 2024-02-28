package com.veganplanet.system.controller;

import com.veganplanet.common.core.auth.AuthContext;
import com.veganplanet.common.core.auth.Login;
import com.veganplanet.common.core.request.model.AuthUserInfo;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.service.application.SysUserQueryService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *系统用户管理
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserQueryService sysUserQueryService;


    @Login
    @PostMapping("/getSysUserInfo")
    public Res getSysUserInfo() {
        AuthUserInfo authUserInfo = AuthContext.getLoginInfo();
        return sysUserQueryService.getSysUserInfo(authUserInfo);
    }
}
