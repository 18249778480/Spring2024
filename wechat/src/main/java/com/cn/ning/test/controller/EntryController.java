package com.cn.ning.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @RequestMapping("/add")
    public String addEntryPrice(){
        String flag = "test" ;


        return flag;
    }
}
