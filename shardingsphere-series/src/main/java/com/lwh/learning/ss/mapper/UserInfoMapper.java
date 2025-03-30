package com.lwh.learning.ss.mapper;
import com.lwh.learning.ss.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lwh
 * @date 2025-03-30 19:02:41
 * @describe -
 */
@Mapper
public interface UserInfoMapper {

    int insertSelective(UserInfo userInfo);


}