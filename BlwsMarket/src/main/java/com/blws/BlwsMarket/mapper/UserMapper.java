package com.blws.BlwsMarket.mapper;

import com.blws.BlwsMarket.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void saveUser(UserVO userVO);
}