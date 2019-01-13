package com.springmvc.ctrl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.statics.Cons;

@Controller
public class TestB5RequestMapping {

	/**
	 * headers = {"content-type=text/xml","content-type=application/xml"}
	 * 注意：请求时，必须申明两个 content-type
	 * 需要使用 postman 测试
	 * @author xilh
	 * @since 20190102
	 * @param request
	 * @return
	 */
	@RequestMapping(value="B5",headers = {"content-type=text/xml","content-type=application/xml"})
	public String test(HttpServletRequest request) {
		System.out.println("B5!!!");
		InputStream in 			= null;
		Reader reader  			= null;
		BufferedReader bReader 	= null;
		try {
			in 		= request.getInputStream();
			reader  = new InputStreamReader(in);
			bReader = new BufferedReader(reader);
			
			StringBuilder builder = new StringBuilder();
			String str = null;
			while ((str = bReader.readLine()) != null) {
				builder.append(str);
			}
			
			System.out.println(builder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (reader != null) {
					reader.close();
				}
				if (bReader != null) {
					bReader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return Cons.SUCCESS;
	}
}
