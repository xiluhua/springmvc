package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.statics.Cons;

@Controller
public class TestC25SimpleMappingExceptionResolver {

	@RequestMapping(value="C25")
	public String test(@RequestParam("i") Integer i) {
		System.out.println("C25!!!");
		String[] arr = new String[5];
		System.out.println(arr[i]);
		return Cons.SUCCESS;
	}
	
}
