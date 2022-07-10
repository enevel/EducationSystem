package com.educationsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.educationsystem.common.dto.SysMenuDto;
import com.educationsystem.entity.SysMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Alexie
 * @since 2022-05-18
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenuDto> getCurrentUserNav();

    List<SysMenu> tree();
}
