package com.zhiyou100.dumplings.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.dumplings.entity.Brands;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
@Mapper
public interface BrandsMapper extends BaseMapper<Brands> {
    List<Brands> queryAll();
}
