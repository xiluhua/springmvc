package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.statics.Cons;

@Controller
public class TestB7PathVariable {

	@RequestMapping(value="B7/{id}")
	public String test(@PathVariable(value = "id") int id) {
		System.out.println("B7!!!");
		System.out.println("id: "+id);
		return Cons.SUCCESS;
	}
}
