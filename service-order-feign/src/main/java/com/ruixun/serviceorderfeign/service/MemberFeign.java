package com.ruixun.serviceorderfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-member",fallback = MemberFeign.class)
public interface MemberFeign {

    @RequestMapping("/getUserList")
    public List<String> getUserList();



}
