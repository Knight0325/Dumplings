package com.zhiyou100.dumplings.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiyou100.dumplings.entity.Brands;
import com.zhiyou100.dumplings.mapper.BrandsMapper;
import com.zhiyou100.dumplings.service.IBrandsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
@Service("brandsService")
public class BrandsServiceImpl extends ServiceImpl<BrandsMapper, Brands> implements IBrandsService {
    @Resource
    private BrandsMapper brandsMapper;

    @Override
    public List<Brands> queryAll() {
        return brandsMapper.queryAll();
    }
}
