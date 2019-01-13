package com.springmvc.ctrl;

import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestB4RequestMapping {

	@RequestMapping(value="B4",params = {"username","age!=10"})
	public String test() {
		System.out.println("B4!!!");
		return Cons.SUCCESS;
	}
}
