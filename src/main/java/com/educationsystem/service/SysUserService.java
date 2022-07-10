package com.educationsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.educationsystem.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Alexie
 * @since 2022-05-18
 */
public interface SysUserService extends IService<SysUser> {

    SysUser getByUsername(String username);

    String getUserAuthorityInfo(Long userId);

    void clearUserAuthorityInfo(String username);

    void clearUserAuthorityInfoByRoleId(Long roleId);

    void clearUserAuthorityInfoByMenuId(Long menuId);
}
