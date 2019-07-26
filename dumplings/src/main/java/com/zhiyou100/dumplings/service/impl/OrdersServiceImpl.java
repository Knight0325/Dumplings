package com.zhiyou100.dumplings.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiyou100.dumplings.entity.Orders;
import com.zhiyou100.dumplings.mapper.OrdersMapper;
import com.zhiyou100.dumplings.service.IOrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
