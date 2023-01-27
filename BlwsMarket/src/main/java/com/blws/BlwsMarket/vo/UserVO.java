package com.blws.BlwsMarket.vo;

import lombok.Data;

import java.util.Collection;
import java.util.Collections;

@Data
public class UserVO {
    private int userId;
    private String userName;
    private String userEmail;
    private String userJoinDt;
    private String userPwd;
    private String userAuth;
    private String userPreferRegion;
}