package com.ltp.controller;

import com.ltp.domain.TbContent;
import com.ltp.dto.ResponseResult;
import com.ltp.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/8
 */
@RestController
@RequestMapping("/contents")
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;
    /**
     * @Description: 获取所又信息
     * @param: []
     * @return: com.ltp.dto.ResponseResult<java.util.List<com.ltp.domain.TbContent>>
     * @auther: Ltp
     * @date: 2020/4/8 20:16
     */
    @GetMapping(value = "/")
    public ResponseResult<List<TbContent>> selectAll() {
        ResponseResult<List<TbContent>> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(tbContentService.selectAll()).setMessage("查询成功");
        return responseResult;
    }
    @GetMapping(value = "/{id}")
    public ResponseResult<TbContent> queryById(@PathVariable String id) {
        ResponseResult<TbContent> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(tbContentService.queryById(id)).setMessage("查询成功");
        return responseResult;
    }

}
