package com.zhiyou100.dumplings.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiyou100.dumplings.entity.Orderlog;
import com.zhiyou100.dumplings.mapper.OrderlogMapper;
import com.zhiyou100.dumplings.service.IOrderlogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
@Service
public class OrderlogServiceImpl extends ServiceImpl<OrderlogMapper, Orderlog> implements IOrderlogService {

}
