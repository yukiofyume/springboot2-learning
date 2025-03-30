package com.lwh.learning.ss.mapper;
import com.lwh.learning.ss.model.Order;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lwh
 * @date 2025-03-30 19:02:26
 * @describe -
 */
@Mapper
public interface OrderMapper {

    int insertSelective(Order order);


}