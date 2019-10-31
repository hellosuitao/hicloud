package com.ruixun.serviceorderfeign.controller;

import com.ruixun.serviceorderfeign.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class FeignController {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/getList")
    public List<String> getList(){
      return  memberFeign.getUserList();
    }
}
