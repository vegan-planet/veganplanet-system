package com.veganplanet.system.controller;

import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.domain.vo.SysUserVO;
import com.veganplanet.system.service.application.SysUserQueryService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @date 2024/1/15 15:36
 */
@RestController
@RequestMapping("/sysLogin")
public class SysLoginController {

    @Resource
    private SysUserQueryService sysUserQueryService;

    /**
     * <p>登录</p>
     * @date 2024/1/13 13:29
     * @param
     * @return
     */
    @PostMapping("/login")
    public Res login(@RequestBody @Valid SysUserVO userVO) {
        return sysUserQueryService.login(userVO);
    }
}
