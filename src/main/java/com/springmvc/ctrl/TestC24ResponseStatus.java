package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.exception.UsernameNotFoundException;
import com.springmvc.statics.Cons;

@Controller
public class TestC24ResponseStatus {

	@RequestMapping(value="C24")
	public String test(@RequestParam("i") Integer i) {
		System.out.println("C24!!!");
		System.out.println("1 : "+i);
		if (i == 10) {
			throw new UsernameNotFoundException();
		}
		return Cons.SUCCESS;
	}
	
}
