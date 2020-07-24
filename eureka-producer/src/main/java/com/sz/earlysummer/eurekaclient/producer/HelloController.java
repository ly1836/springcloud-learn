package com.sz.earlysummer.eurekaclient.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther leiyang
 * @create 2019-05-08 11:40
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
	try {
	    Thread.sleep(100);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	return "hello "+name+"，this is first messge";
    }
}