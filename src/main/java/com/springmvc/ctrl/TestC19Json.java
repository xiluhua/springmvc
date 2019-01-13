package com.springmvc.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.springmvc.pojo.User;

@Controller
public class TestC19Json {

	/**
	 * 不会乱码
	 */
	@RequestMapping(value="C19")
	public void test(HttpServletResponse response) throws IOException {
		System.out.println("C19!!!");
		List<User> list = this.getUserList();
		
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd"));
	}
	
	/**
	 * 即便加上： response.setCharacterEncoding("utf-8");
	 * 还是会乱码
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="C192")
	public String test2(HttpServletResponse response) {
		System.out.println("C192!!!");
		List<User> list = this.getUserList();
		
		response.setCharacterEncoding("utf-8");
		return JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd");
	}

	public List<User> getUserList() {
		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setAge(10);
		user1.setBirth(new Date());
		user1.setGender(1);
		user1.setId(1);
		user1.setUsername("张三");
		
		User user2 = new User();
		user2.setAge(12);
		user2.setBirth(new Date());
		user2.setGender(2);
		user2.setId(2);
		user2.setUsername("李四");
		
		list.add(user1);
		list.add(user2);
		return list;
	}
}
