// package com.blws.BlwsMarket.service;

// import com.blws.BlwsMarket.mapper.UserMapper;
// import com.blws.BlwsMarket.vo.UserVO;
// import lombok.RequiredArgsConstructor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import java.text.SimpleDateFormat;
// import java.util.Date;

// @Service
// @RequiredArgsConstructor
// public class UserService {
//     // 회원가입 시 저장시간을 넣어줄 DateTime형
//     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
//     Date time = new Date();
//     String localTime = format.format(time);

//     @Autowired
//     UserMapper userMapper;

//     @Autowired
//     BCryptPasswordEncoder passwordEncoder;

//     @Transactional
//     public void joinUser(UserVO userVO) {
//         BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//         userVO.setUserPwd(passwordEncoder.encode(userVO.getUserPwd()));
//         userVO.setUserAuth("USER");
//         userVO.setUserJoinDt(localTime);
//         userMapper.saveUser(userVO);
//     }
// }

package com.blws.BlwsMarket.service;

import com.blws.BlwsMarket.mapper.UserMapper;
import com.blws.BlwsMarket.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserService {
    // 회원가입 시 저장시간을 넣어줄 DateTime형
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    Date time = new Date();
    String localTime = format.format(time);

    @Autowired
    UserMapper userMapper;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public void joinUser(UserVO userVO) {
        userVO.setUserPwd(passwordEncoder.encode(userVO.getUserPwd()));
        userVO.setUserAuth("USER");
        userVO.setUserJoinDt(localTime);
        userMapper.saveUser(userVO);
    }
}
