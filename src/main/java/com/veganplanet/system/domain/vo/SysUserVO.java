package com.veganplanet.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * description
 *
 * @author wxh_work@163.com
 * @date 2023/2/2 23:14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long userNo;

    private String userName;

    private String password;

    private String phone;
}
