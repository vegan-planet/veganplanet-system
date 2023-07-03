package com.veganplanet.system.config;

import com.veganplanet.common.core.exception.AbstractCustomizedRunTimeException;
import com.veganplanet.common.core.response.ServiceStatus;
import com.veganplanet.system.constant.enums.SystemExceptionStatusEnum;

import javax.annotation.Nonnull;

/**
 * <p>系统异常信息</p>
 *
 * @author wxh_work@163.com
 * @date 2023/2/2 18:13
 */
public final class SystemIllegalException extends AbstractCustomizedRunTimeException {
    private static final long serialVersionUID = 1L;

    public SystemIllegalException() {
        super(SystemExceptionStatusEnum.SYSTEM_SERVICE_ERROR);
    }

    public SystemIllegalException(@Nonnull ServiceStatus serviceStatus) {
        super(serviceStatus);
    }

    public SystemIllegalException(@Nonnull ServiceStatus serviceStatus, @Nonnull final String message) {
        super(serviceStatus, message);
    }
}
