package com.blws.BlwsMarket.controller;

import com.blws.BlwsMarket.service.UserService;
import com.blws.BlwsMarket.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 회원가입 폼
     * 
     * @return
     */
    @GetMapping("/signUp")
    public String signUpForm() {
        return "signup";
    }

    /**
     * 회원가입 진행
     * 
     * @param user
     * @return
     */
    @PostMapping("/signUp")
    public String signUp(UserVO userVO) {
        userService.joinUser(userVO);
        return "redirect:/login"; // 로그인 구현 예정
    }
}
