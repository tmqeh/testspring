package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.TestService;

@Controller
@RequestMapping("/test")
class TestController {
	private TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	@RequestMapping(value = "/test.html")
	public String test() {
		int cnt = testService.test("±èÁø¿ì", 1);
		System.out.println(cnt);
		return "";
	}
	
}
