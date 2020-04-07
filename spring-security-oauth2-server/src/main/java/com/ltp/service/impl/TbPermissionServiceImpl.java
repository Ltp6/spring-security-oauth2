package com.ltp.service.impl;

import com.ltp.domain.TbPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ltp.mapper.TbPermissionMapper;
import com.ltp.service.TbPermissionService;

import java.util.List;

/**
* @Description: TODO
* @Author: Ltp
* @Date: 2020/4/7
*/
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;


    @Override
    public List<TbPermission> queryPermissionByUserId(Long userId) {
        return tbPermissionMapper.queryPermissionByUserId(userId);
    }
}
