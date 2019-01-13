package com.springmvc.ctrl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.statics.Cons;

@Controller
public class TestC12Model {

	@RequestMapping(value="C12")
	public String test(HttpServletRequest request, Map<String, Object> map) {
		System.out.println("C12!!!");
		map.put("zhangsan","1");
		map.put("lisi","2");
		map.put("time","C12");
		System.out.println(request.getParameter("username"));
		return Cons.SUCCESS;
	}
}
