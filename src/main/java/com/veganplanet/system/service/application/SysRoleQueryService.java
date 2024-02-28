package com.veganplanet.system.service.application;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.veganplanet.common.core.response.BasePageResult;
import com.veganplanet.common.core.response.Res;
import com.veganplanet.system.domain.entity.SysRole;
import com.veganplanet.system.domain.vo.SysRoleQueryVO;
import com.veganplanet.system.service.SysRoleService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 系统角色查询
 *
 * @date 2024/1/13 13:33
 */
@Slf4j
@Service
public class SysRoleQueryService {
    @Resource
    private SysRoleService sysRoleService;

    /**
     * <p>角色列表分页条件查询</p>
     * @date 2024/2/28 16:28
     * @param
     * @return
     */
    public Res getSysRolePageList(SysRoleQueryVO sysRoleQueryVO) {
        IPage<SysRole> sysRoleIPage= this.sysRoleService.getSysRolePageList(sysRoleQueryVO);
        return Res.ok(BasePageResult.newInstance(sysRoleIPage,sysRoleIPage.getRecords()));
    }

}
