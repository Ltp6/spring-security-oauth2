package com.ltp.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ltp.mapper.TbContentCategoryMapper;
import com.ltp.service.TbContentCategoryService;
/** 
* @Description: TODO
* @Author: Ltp
* @Date: 2020/4/8
*/
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
