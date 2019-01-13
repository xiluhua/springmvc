package com.springmvc.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.statics.Cons;

@Controller
public class TestC11ModelAndView {

	@RequestMapping(value="C11")
	public ModelAndView test(HttpServletRequest request) {
		System.out.println("C11!!!");
		ModelAndView mv = new ModelAndView();
		System.out.println(request.getParameter("username"));
		mv.addObject("time","20190112");
		mv.setViewName(Cons.SUCCESS);
		return mv;
	}
}
