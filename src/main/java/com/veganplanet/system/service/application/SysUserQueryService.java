package com.veganplanet.system.service.application;

import com.alibaba.fastjson.JSON;
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
 * description
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
    public Res login(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserService.getSysUserInfo(sysUserVO);
        final String password = DigestUtils.md5Hex(sysUserVO.getPassword());
        if (Objects.isNull(sysUser.getPassword()) || !sysUser.getPassword().equals(password)) {
            return Res.get(ServiceStatus.GET.NOT_FOUND, "您输入的手机号或密码不正确");
        } else {
            //生成token
            String token = UUID.randomUUID().toString().replaceAll("-", "");
            //把用户信息放到redis里面
            redisTemplate.opsForValue().set("user:veganplanet:"+token,
                    JSON.toJSONString(sysUser),
                    30, TimeUnit.DAYS);
            return Res.ok(token);
        }
    }

    public Res getSysUserInfo(SysUserVO sysUserVO) {
        return Res.ok(sysUserService.getSysUserInfo(sysUserVO));
    }
}
