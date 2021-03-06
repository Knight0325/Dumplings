package com.zhiyou100.dumplings.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiyou100.dumplings.entity.Tastes;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
public interface ITastesService extends IService<Tastes> {
    public List<Tastes> queryAll();
}
