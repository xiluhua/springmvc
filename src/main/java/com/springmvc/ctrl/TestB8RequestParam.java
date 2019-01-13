package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.statics.Cons;

@Controller
public class TestB8RequestParam {

	@RequestMapping(value="B8")
	public String test(@RequestParam(value = "username") String username,
			@RequestParam(value="age",required=true,defaultValue="0") int age) {
		System.out.println("B8!!!");
		System.out.println("username: "+username);
		System.out.println("age     : "+age);
		return Cons.SUCCESS;
	}
}
