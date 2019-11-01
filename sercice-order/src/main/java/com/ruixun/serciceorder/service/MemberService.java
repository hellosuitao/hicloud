package com.ruixun.serciceorder.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="orderError")/*添加断路器*/
    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }

    public List<String> orderError() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
