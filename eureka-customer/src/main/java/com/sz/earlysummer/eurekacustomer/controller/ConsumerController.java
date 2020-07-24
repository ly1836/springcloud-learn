package com.sz.earlysummer.eurekacustomer.controller;

import com.sz.earlysummer.eurekacustomer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther leiyang
 * @create 2019-05-08 11:52
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
	return HelloRemote.hello(name);
    }

}