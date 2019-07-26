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
    public class Orderdums implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String goodId;

    private String name;

    private Long price;

    private Integer number;

    private String path;


}
