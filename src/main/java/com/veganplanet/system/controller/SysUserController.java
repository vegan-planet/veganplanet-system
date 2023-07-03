package com.veganplanet.system.controller;

import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.model.vo.UserVO;
import com.veganplanet.system.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private UserService userService;

    @PostMapping("/getUserInfo")
    public Res getUserInfo(@RequestBody @Valid UserVO userVO) {
        System.out.println(userVO.toString());
        return Res.ok(userService.getUserInfo(userVO.getUserId()));
    }
}
