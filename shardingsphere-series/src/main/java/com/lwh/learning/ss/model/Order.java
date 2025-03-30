package com.lwh.learning.ss.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwh
 * @date 2025-03-30 19:02:26
 * @describe -
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
    * 订单号
    */
    private Long orderId;

    /**
    * 订单总金额
    */
    private Integer orderPrice;

    /**
    * 用戶id
    */
    private Long userId;
}