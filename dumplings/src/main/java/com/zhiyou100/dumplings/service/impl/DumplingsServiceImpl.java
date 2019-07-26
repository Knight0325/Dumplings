package com.zhiyou100.dumplings.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiyou100.dumplings.entity.Dumplings;
import com.zhiyou100.dumplings.mapper.DumplingsMapper;
import com.zhiyou100.dumplings.service.IDumplingsService;
import com.zhiyou100.dumplings.util.IDUtils;
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
public class DumplingsServiceImpl extends ServiceImpl<DumplingsMapper, Dumplings> implements IDumplingsService {
    @Resource
    private DumplingsMapper dumplingsMapper;

    @Override
    public List<Dumplings> queryAll() {
        return dumplingsMapper.queryAll();
    }

    @Override
    public int add(Dumplings dumplings) {
        dumplings.setId(IDUtils.genItemId());
        int num = dumplingsMapper.add(dumplings);
        return num;
    }
}
