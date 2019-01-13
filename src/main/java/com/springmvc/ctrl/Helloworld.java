package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Helloworld {

	@RequestMapping(value="index")
	public String index() {
		System.out.println("hello world!!!");
		return "index";
	}
}
