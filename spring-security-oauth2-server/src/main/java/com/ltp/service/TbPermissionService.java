package com.ltp.service;

import com.ltp.domain.TbPermission;

import java.util.List;

/**
* @Description: TODO
* @Author: Ltp
* @Date: 2020/4/7
*/
public interface TbPermissionService{

    List<TbPermission> queryPermissionByUserId(Long userId);

}
