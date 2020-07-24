package com.sz.earlysummer.eurekacustomer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EurekaCustomerApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void contextLoads() {
	try {
	    int i=0;
	    while (++i < 100){
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/hello/ly")).andReturn();
		System.out.println(mvcResult.getResponse().getContentAsString());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
