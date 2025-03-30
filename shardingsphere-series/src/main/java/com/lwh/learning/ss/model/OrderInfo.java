package com.lwh.learning.ss.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwh
 * @date 2025-03-30 19:02:31
 * @describe -
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    /**
    * 订单详情号
    */
    private Long orderInfoId;

    /**
    * 订单号
    */
    private Long orderId;

    /**
    * 商品名称
    */
    private String shopingName;

    /**
    * 商品价格
    */
    private Integer shopingPrice;
}