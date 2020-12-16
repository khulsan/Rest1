package com.slokam.Rest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class Rest1TestController { 
	private static Logger LOGGER = LoggerFactory.getLogger(Rest1TestController.class);

	@Autowired
	private RestTemplate rt;
	
	@GetMapping("rest1test")
	public String testRest()
	{
	LOGGER.error("hello i am debug");	
		
	String str = rt.getForObject("http://Rest/test1", String.class);
	return "sample::Data"+str;
	}

}
