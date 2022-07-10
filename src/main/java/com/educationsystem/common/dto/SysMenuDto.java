/**
 * 关于侧边栏的各个属性,感觉不太需要
  */

package com.educationsystem.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/***
 *             title: '系统管理',
 *             name: 'SysManege',
 *             icon: 'expand',
 *             component: '',
 *             path: '',
 *             children: []
 */
@Data
public class SysMenuDto implements Serializable {

    private Long id;

    private String name;
    private String title;
    private String icon;
    private String component;
    private String path;
    private List<SysMenuDto> children = new ArrayList<>();

}
