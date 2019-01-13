package com.springmvc.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.springmvc.pojo.User;
import com.springmvc.statics.Cons;

@Controller
public class TestC18DateTimeFormat {

	@RequestMapping(value="C18")
	public String test(HttpServletRequest request, User user) {
		System.out.println("C18!!!");
		System.out.println(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd"));
		return Cons.SUCCESS;
	}
}
