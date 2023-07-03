package com.veganplanet.system.constant.enums;

import com.veganplanet.common.core.response.ServiceStatus;
import lombok.Getter;

/**
 * description
 *
 * @author wxh_work@163.com
 * @date 2023/2/2 18:18
 */
@Getter
public enum SystemExceptionStatusEnum implements ServiceStatus {
    /**
     * 系统服务异常，请稍后重试
     */
    SYSTEM_SERVICE_ERROR(0, 100000, "服务异常，请稍后重试");
    /**
     * 服务状态
     */
    private final int status;
    /**
     * 状态码
     */
    private final int code;
    /**
     * 信息
     */
    private final String message;

    SystemExceptionStatusEnum(int status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
