package com.lwh.learning.ss.mapper;
import com.lwh.learning.ss.model.Shoping;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lwh
 * @date 2025-03-30 19:02:36
 * @describe -
 */
@Mapper
public interface ShopingMapper {

    int insertSelective(Shoping shoping);

    List<Shoping> selectByShopingId(@Param("shopingId")Long shopingId);

    List<Shoping> selectAll();


}