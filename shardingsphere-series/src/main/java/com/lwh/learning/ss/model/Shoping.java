package com.lwh.learning.ss.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lwh
 * @date 2025-03-30 19:02:36
 * @describe -
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shoping implements Serializable {

    private static final long serialVersionUID = -6732200717543171488L;

    /**
    * 商品id
    */
    private Long shopingId;

    /**
    * 商品名称
    */
    private String shopingName;

    /**
    * 商品价格
    */
    private Integer shopingPrice;
}