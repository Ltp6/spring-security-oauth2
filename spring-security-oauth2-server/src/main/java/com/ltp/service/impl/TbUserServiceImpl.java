package com.ltp.service.impl;

import com.ltp.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ltp.mapper.TbUserMapper;
import com.ltp.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
* @Description: TODO
* @Author: Ltp
* @Date: 2020/4/7
*/
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserByUserName(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }
}
