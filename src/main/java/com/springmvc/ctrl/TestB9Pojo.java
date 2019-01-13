package com.springmvc.ctrl;

import com.springmvc.pojo.User;
import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestB9Pojo {

	@RequestMapping(value="B9")
	public String test(User user) {
		System.out.println("B9!!!");
		System.out.println("user: "+user);
		return Cons.SUCCESS;
	}
}
