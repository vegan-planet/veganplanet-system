package com.veganplanet.system.service.application;

import com.alibaba.fastjson.JSON;
import com.veganplanet.common.core.request.model.AuthUserInfo;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.common.core.response.ServiceStatus;
import com.veganplanet.system.domain.entity.SysUser;
import com.veganplanet.system.domain.vo.SysUserVO;
import com.veganplanet.system.service.SysUserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * 系统用户查询
 *
 * @date 2024/1/13 13:33
 */
@Slf4j
@Service
public class SysUserQueryService {
    @Resource
    private RedisTemplate<String,String> redisTemplate;
    @Resource
    private SysUserService sysUserService;

    /**
    * <p>系统手机号密码登录</p>
    * @date 2024/1/16 22:32
    * @param
    * @return
    */
    public Res passwordLogin(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserService.getSysUserInfo(sysUserVO);
        if (Objects.isNull(sysUser)) {
            return Res.get(ServiceStatus.GET.NOT_FOUND, "未找到该用户");
        }
        final String password = DigestUtils.md5Hex(sysUserVO.getPassword());
        if (Objects.isNull(sysUser.getPassword()) || !sysUser.getPassword().equals(password)) {
            return Res.get(ServiceStatus.GET.NOT_FOUND, "您输入的手机号或密码不正确");
        } else {
            //生成token
            String token = UUID.randomUUID().toString().replaceAll("-", "");
            //把用户信息放到redis里面
            redisTemplate.opsForValue().set("system:veganplanet:"+token,
                    JSON.toJSONString(sysUser),
                    30, TimeUnit.DAYS);
            return Res.ok(token);
        }
    }

    public Res getSysUserInfo(AuthUserInfo authUserInfo) {
        return Res.ok(sysUserService.getSysUserByUserNo(authUserInfo.getUserNo()));
    }
}
