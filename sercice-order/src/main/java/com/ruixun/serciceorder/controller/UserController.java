package com.ruixun.serciceorder.controller;

import com.ruixun.serciceorder.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/test")
    public List<String> getUserList(){
        return memberService.getOrderByUserList();
    }
}
