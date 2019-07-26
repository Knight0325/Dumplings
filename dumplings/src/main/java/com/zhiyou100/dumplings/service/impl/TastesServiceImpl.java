package com.zhiyou100.dumplings.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiyou100.dumplings.entity.Tastes;
import com.zhiyou100.dumplings.mapper.TastesMapper;
import com.zhiyou100.dumplings.service.ITastesService;
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
@Service
public class TastesServiceImpl extends ServiceImpl<TastesMapper, Tastes> implements ITastesService {
    @Resource
    private TastesMapper tastesMapper;
    @Override
    public List<Tastes> queryAll() {
        return tastesMapper.queryAll();
    }
}
