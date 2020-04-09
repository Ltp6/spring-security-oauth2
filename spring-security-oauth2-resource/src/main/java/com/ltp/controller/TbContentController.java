package com.ltp.controller;

import com.ltp.domain.TbContent;
import com.ltp.dto.ResponseResult;
import com.ltp.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/8
 */
@RestController
@RequestMapping(value = "/contents")
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    /**
     * @Description: 获取所又信息
     * @param: []
     * @return: com.ltp.dto.ResponseResult<java.util.List < com.ltp.domain.TbContent>>
     * @auther: Ltp
     * @date: 2020/4/8 20:16
     */
    @GetMapping(value = "/")
    public ResponseResult<List<TbContent>> selectAll() {
        ResponseResult<List<TbContent>> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(tbContentService.selectAll()).setMessage("查询成功");
        return responseResult;
    }

    @GetMapping(value = "/view/{id}")
    public ResponseResult<TbContent> queryById(@PathVariable String id) {
        ResponseResult<TbContent> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(tbContentService.queryById(id)).setMessage("查询成功");
        return responseResult;
    }

    @PostMapping(value = "/insert")
    public ResponseResult<String> add(TbContent tbContent) {
        ResponseResult<String> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(null).setMessage(tbContentService.add(tbContent) > 0 ? "新增成功" : "新增失败");
        return responseResult;
    }

    @PutMapping(value = "/update")
    public ResponseResult<String> update(TbContent tbContent) {
        ResponseResult<String> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(null).setMessage(tbContentService.update(tbContent) > 0 ? "修改成功" : "修改失败");
        return responseResult;
    }

    @DeleteMapping(value = "/delete")
    public ResponseResult<String> delete(String id) {
        ResponseResult<String> responseResult = new ResponseResult<>();
        responseResult.setState(HttpStatus.OK.value()).setData(null).setMessage(tbContentService.delete(id) > 0 ? "删除成功" : "删除失败");
        return responseResult;
    }

}
