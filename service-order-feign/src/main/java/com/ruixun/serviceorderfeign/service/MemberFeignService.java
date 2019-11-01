package com.ruixun.serviceorderfeign.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberFeignService implements MemberFeign {

    @Override
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
