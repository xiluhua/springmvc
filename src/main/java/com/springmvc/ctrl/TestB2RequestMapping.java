package com.springmvc.ctrl;

import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="2")
@Controller
public class TestB2RequestMapping {

	@RequestMapping(value="B2")
	public String test() {
		System.out.println("B2!!!");
		return Cons.SUCCESS;
	}
}
