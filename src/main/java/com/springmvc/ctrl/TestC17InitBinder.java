package com.springmvc.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.springmvc.pojo.User;
import com.springmvc.statics.Cons;

@Controller
public class TestC17InitBinder {

	@RequestMapping(value="C17")
	public String test(HttpServletRequest request, User user) {
		System.out.println("C17!!!");
		System.out.println(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd"));
		return Cons.SUCCESS;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields("birth");
	}
}
