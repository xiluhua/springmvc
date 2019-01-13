package com.springmvc.ctrl;

import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestB3RequestMapping {

	@RequestMapping(value="B3",method = RequestMethod.POST)
	public String test() {
		System.out.println("B3!!!");
		return Cons.SUCCESS;
	}
}
