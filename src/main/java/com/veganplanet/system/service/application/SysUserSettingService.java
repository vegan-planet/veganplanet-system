package com.veganplanet.system.service.application;

import com.veganplanet.system.service.SysUserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 系统用户设置
 *
 * @date 2024/1/13 13:33
 */
@Slf4j
@Service
public class SysUserSettingService {
    @Resource
    private SysUserService sysUserService;

}
