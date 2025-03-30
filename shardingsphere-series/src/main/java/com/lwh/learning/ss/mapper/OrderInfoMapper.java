package com.lwh.learning.ss.mapper;
import com.lwh.learning.ss.model.OrderInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lwh
 * @date 2025-03-30 19:02:31
 * @describe -
 */
@Mapper
public interface OrderInfoMapper {

    int insertSelective(OrderInfo orderInfo);


}