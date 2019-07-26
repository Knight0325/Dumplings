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
    public class Orderlog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime leaveTime;

    private LocalDateTime arriveTime;

    private String userId;

    private String tel;

    private String address;

    private String send;

    private String sendTel;

    private String sendAddress;

    private String logisticCompany;


}
