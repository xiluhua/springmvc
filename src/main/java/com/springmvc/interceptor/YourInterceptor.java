package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class YourInterceptor implements HandlerInterceptor{

	/**
	 * 该方法在目标方法前被调用
	 * 返回 true，会继续执行后续的拦截器和目标方法
	 * 返回 false,就不会执行下去
	 * @category 可以考虑做权限、日志、事务
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("YourInterceptor preHandle ...");
		return true;
	}
	
	/**
	 * 调用目标方法之后，渲染视图之前
	 * @category 可以对请求域中的属性或视图进行修改
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			 ModelAndView modelAndView) throws Exception {
		System.out.println("YourInterceptor postHandle ...");

	}
	
	/**
	 * 渲染视图之后
	 * @category 可以用来释放资源
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			 Exception ex) throws Exception {
		System.out.println("YourInterceptor afterCompletion ...");

	}
}
