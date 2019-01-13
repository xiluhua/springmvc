package com.springmvc.ctrl;

import com.springmvc.pojo.User;
import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class TestC13ModelAttribute {

	@RequestMapping(value="C13")
	public String test(HttpServletRequest request, User user) {
		System.out.println("C13!!!");
		System.out.println("user: "+user);
		return Cons.SUCCESS;
	}

	@ModelAttribute
	public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map){
		if (id != null){
			// 模拟从数据库中取出对象
			User user = new User(1,"Tom",1,18);
			System.out.println("从数据库取出的对象： "+user);
			map.put("user", user);
		}
	}
}
