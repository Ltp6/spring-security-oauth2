package com.ltp.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/8
 */
@Data
@Accessors(chain = true)
public class ResponseResult<T> implements Serializable {
    /**
     * 状态码
     */
    private Integer state;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

}
