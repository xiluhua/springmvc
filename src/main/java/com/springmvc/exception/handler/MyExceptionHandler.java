package com.springmvc.exception.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {
	
	/**
	 * 1. 在 @ExceptionHandler 方法的入参中加入 Exception 类型的参数，该参数即对应发生的异常对象
	 * 2. 在@ExceptionHandler 方法的入参中不能传入 Map。若希望把异常信息传导到页面上，需要使用 ModelAndView 作为返回值
	 * 3. @ExceptionHandler 有优先级问题
	 * 4. 如果在当前 handler 中找不到 @ExceptionHandler 方法来对应出现的异常，则将去 @ControllerAdvice 标记的方法中找
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView handleArithmeticExceptionHandler(Exception ex) {
		System.out.println("{出异常了： } "+ex);
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
}
