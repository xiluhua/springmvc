package com.springmvc.ctrl;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.statics.Cons;

@Controller
public class TestB6RequestMapping {

	/**
	 * headers = {"content-type=text/xml"}
	 * 注意：请求时，必须申明两个 content-type
     * 需要使用 postman 测试
	 * @author xilh
	 * @since 20190102
	 * @param request
	 * @return
	 */
	@RequestMapping(value="B6",headers = {"content-type=text/xml"})
	public String test(HttpServletRequest request) {
		System.out.println("B6!!!");
		InputStream in 			= null;
		try {
			in 				= request.getInputStream();
			// 设置一个，每次 装载信息的容器
			byte[] buf 		= new byte[1024];
			// 定义一个StringBuffer用来存放字符串
			StringBuffer sb = new StringBuffer();
			// 开始读取数据
			int len = 0;// 每次读取到的数据的长度
			while ((len = in.read(buf)) != -1) {// len值为-1时，表示没有数据了
				// append方法往sb对象里面添加数据
				sb.append(new String(buf, 0, len, "utf-8"));
			}
			// 输出字符串
			System.out.println(sb.toString());
			System.out.println(sb.toString().length());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return Cons.SUCCESS;
	}
}
