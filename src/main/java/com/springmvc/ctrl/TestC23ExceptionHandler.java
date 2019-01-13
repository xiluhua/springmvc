package com.springmvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.statics.Cons;

@Controller
public class TestC23ExceptionHandler {

	@RequestMapping(value="C23")
	public String test(@RequestParam("i") Integer i) {
		System.out.println("C23!!!");
		System.out.println("1 : "+i);
		System.out.println("2 : "+2/i);
		return Cons.SUCCESS;
	}
	
	/**
	 * 1. 在 @ExceptionHandler 方法的入参中加入 Exception 类型的参数，该参数即对应发生的异常对象
	 * 2. 在@ExceptionHandler 方法的入参中不能传入 Map。若希望把异常信息传导到页面上，需要使用 ModelAndView 作为返回值
	 * 3. @ExceptionHandler 有优先级问题
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value=ArithmeticException.class)
	public ModelAndView handleArithmeticExceptionHandler(Exception ex) {
		System.out.println("[出异常了： ]"+ex);
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	public ModelAndView handleRuntimeExceptionHandler(Exception ex) {
		System.out.println("出异常了： "+ex);
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
}
