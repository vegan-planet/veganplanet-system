package com.veganplanet.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.veganplanet.system.mapper.SysUserMapper;
import com.veganplanet.system.domain.entity.SysUser;
import com.veganplanet.system.domain.vo.SysUserVO;
import com.veganplanet.system.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * description
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:52
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Override
    public SysUser getSysUserInfo(SysUserVO sysUserVO) {
        LambdaQueryWrapper<SysUser> sysUserLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysUserLambdaQueryWrapper.eq(Objects.nonNull(sysUserVO.getPhone()),SysUser::getPhone,sysUserVO.getPhone());
        sysUserLambdaQueryWrapper.eq(Objects.nonNull(sysUserVO.getUserName()),SysUser::getUserName,sysUserVO.getUserName());
        SysUser sysUser = this.getOne(sysUserLambdaQueryWrapper);
        return sysUser;
    }

    @Override
    public SysUser getSysUserByUserNo(Long userNo) {
        return this.getById(userNo);
    }
}
