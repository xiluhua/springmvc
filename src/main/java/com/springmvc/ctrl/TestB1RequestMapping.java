package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.statics.Cons;


@Controller
public class TestB1RequestMapping {

	@RequestMapping(value="B1")
	public String test() {
		System.out.println("B1!!!");
		return Cons.SUCCESS;
	}
}
