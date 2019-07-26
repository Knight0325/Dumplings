package com.zhiyou100.dumplings.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
    public class Brands implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String company;

    private String address;

    private String tel;

    private Integer status;


}
