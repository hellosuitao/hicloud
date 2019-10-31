package com.ruixun.serviceorderfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("service-member")
public interface MemberFeign {

    @RequestMapping("/getUserList")
    public List<String> getUserList();

}
