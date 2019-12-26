package com.cloud.controller;

import com.cloud.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private MemberService memberService;


    @RequestMapping("/getOrderByMember")
    public String getOrderByMember(){
        return memberService.getMember();
    }

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "getOrderInfo";
    }
}
