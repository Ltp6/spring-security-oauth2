package com.ltp.mapper;

import com.ltp.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/7
 */
public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> queryPermissionByUserId(@Param("userId") Long userId);
}