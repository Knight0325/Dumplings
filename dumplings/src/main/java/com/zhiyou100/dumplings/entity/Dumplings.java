package com.zhiyou100.dumplings.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

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
    public class Dumplings implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;//1编号

    private String brandId;//2品牌，用户可见

    private String brandName;

    private String tasteId;//3口味，用户可见

    private String tasteName;

    private Double weight;//4重量，用户可见

    private String path;//5图片，用户可见

    private LocalDate addDate;//6上架时间

    private Long price;//7价格，用户可见

    private Integer stock;//8库存，用户可见

    private Date endDate;//9到期时间，用户可见

    private Integer status;//10状态，用户可见

    private String hotPoint;//11买点，用户可见


}
