package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//스프링
public class blogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		String ret = "";
		String name = "조대한";
		String nick = "빵꾸";
		String br = "<br>";
		for (int i = 0; i < 100 ; i++) {
			ret = ret + name + nick + br;
		}
		return "<h1>" + ret + "</h1>";
	}
}
