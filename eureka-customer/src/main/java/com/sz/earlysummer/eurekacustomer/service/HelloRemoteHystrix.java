package com.sz.earlysummer.eurekacustomer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @auther leiyang
 * @create 2019-05-08 14:41
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
	return "hello " +name+", this messge send failed ";
    }
}