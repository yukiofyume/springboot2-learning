package com.lwh.learning.ss.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwh
 * @date 2025-03-30 19:02:41
 * @describe -
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    /**
    * 用戶id
    */
    private Long userId;

    /**
    * 用戶姓名
    */
    private String userName;

    /**
    * 用戶性別
    */
    private String userSex;

    /**
    * 用戶年齡
    */
    private Integer userAge;
}