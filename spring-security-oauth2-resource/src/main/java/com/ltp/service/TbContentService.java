package com.ltp.service;

import com.ltp.domain.TbContent;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/8
 */
public interface TbContentService {


    List<TbContent> selectAll();

    TbContent queryById(String id);
}
