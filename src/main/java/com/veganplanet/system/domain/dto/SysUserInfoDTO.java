package com.veganplanet.system.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @date 2024/1/14 11:30
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserInfoDTO {
    /**
     * 用户编号
     */
    private Integer userNo;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     *头像
     */
    private String avatar;
}
