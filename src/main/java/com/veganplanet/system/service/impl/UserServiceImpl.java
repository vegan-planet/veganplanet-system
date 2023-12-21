package com.veganplanet.system.service.impl;

import com.veganplanet.common.core.response.ServiceStatus;
import com.veganplanet.system.config.SystemIllegalException;
import com.veganplanet.system.constant.enums.SystemExceptionStatusEnum;
import com.veganplanet.system.model.vo.UserVO;
import com.veganplanet.system.service.UserService;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author wxh_work@163.com
 * @date 2022/12/28 00:52
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserVO getUserInfo(UserVO userVO) {
        System.out.println("userId");
        return userVO;
    }
}
