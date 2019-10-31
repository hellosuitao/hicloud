package com.ruixun.serviceorderfeign.controller;

import com.ruixun.serviceorderfeign.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/order")
public class FeignController {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/getList")
    public List<String> getList(){
      return  memberFeign.getUserList();
    }
}
