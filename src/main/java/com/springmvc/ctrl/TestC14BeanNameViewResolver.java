package com.springmvc.ctrl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.beanNameView.HelloView;

@Controller
public class TestC14BeanNameViewResolver {

	@RequestMapping(value="C14")
	public String test(HttpServletRequest request, Map<String, Object> map) {
		System.out.println("C14!!!");
		return StringUtils.uncapitalize(HelloView.class.getSimpleName());
	}
}
