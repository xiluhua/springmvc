package com.springmvc.ctrl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestC16Forward {

	@RequestMapping(value="C16")
	public String test(HttpServletRequest request, Map<String, Object> map) {
		System.out.println("C16!!!");
		return "forward:/index";
	}
}
