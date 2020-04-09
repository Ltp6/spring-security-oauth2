package com.ltp.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ltp.mapper.TbRoleMapper;
import com.ltp.service.impl.TbRoleService;
/** 
* @Description: TODO
* @Author: Ltp
* @Date: 2020/4/9
*/
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

}
