package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.statics.Cons;

@Controller
public class TestC20RequestAndResponseBody {

	@ResponseBody
	@RequestMapping(value="C20")
	public String test(@RequestBody String body) {
		System.out.println("C20!!!");
		System.out.println("-------------------------------------------");
		System.out.println(body);
		System.out.println("-------------------------------------------");
		return Cons.SUCCESS;
	}
	
}
