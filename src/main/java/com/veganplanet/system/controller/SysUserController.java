package com.veganplanet.system.controller;

import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.model.vo.UserVO;
import com.veganplanet.system.service.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private UserService userService;

    @PostMapping("/getUserInfo")
    public Res getUserInfo(@RequestBody @Valid UserVO userVO) {
        System.out.println(userVO.toString());
        UserVO userInfo = userService.getUserInfo(userVO);
        return Res.ok(userInfo);
    }
}
