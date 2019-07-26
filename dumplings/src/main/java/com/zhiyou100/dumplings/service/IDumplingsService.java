package com.zhiyou100.dumplings.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiyou100.dumplings.entity.Dumplings;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
public interface IDumplingsService extends IService<Dumplings> {
    public List<Dumplings> queryAll();
    int add(Dumplings dumplings);
}
