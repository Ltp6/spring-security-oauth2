package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: 该接口不能被扫描到，否则会报错
 * @Author: Ltp
 * @Date: 2019/10/15
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
