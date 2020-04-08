package com.ltp.service.impl;

import com.ltp.domain.TbContent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ltp.mapper.TbContentMapper;
import com.ltp.service.TbContentService;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/8
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }

    @Override
    public TbContent queryById(String id) {
        return tbContentMapper.selectByPrimaryKey(id);
    }
}
