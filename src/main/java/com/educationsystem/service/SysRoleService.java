package com.educationsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.educationsystem.entity.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Alexie
 * @since 2022-05-18
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> listRolesByUserId(Long userId);
}
