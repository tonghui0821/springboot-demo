package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8S1Controller {


    @RequestMapping("/k8s")
    public String k8s2(){
        return "hello K8s <br/>111222 ";
    }
}
