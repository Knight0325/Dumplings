package com.zhiyou100.dumplings.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* <p>
    * 
    * </p>
*
* @author Knight
* @since 2019-06-28
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    //订单编号
    private String id;
    //用户编号
    private String userId;
    //订单金额，单位是分
    private Long money;
    //下单时间
    private LocalDateTime createTime;
    //优惠金额
    private Long preferential;
    //定单商品编号
    private String orderGoodId;
    //订单物流编号
    private String orderLogId;
    //1、未提交，2、已提交未付款3、已付款4、代发货
    // 5、已发货、6、已收货、7、未评价、8、已评价
    private Integer status;
}
