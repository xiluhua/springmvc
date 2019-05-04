package com.springmvc.ctrl;

import com.springmvc.pojo.User;
import com.springmvc.statics.Cons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@Controller
public class TestC10ServletApi {

	@RequestMapping(value="C10")
	public void test(HttpServletRequest request, HttpServletResponse response, Writer writer) {
        String key = FrameworkServlet.SERVLET_CONTEXT_PREFIX + "springmvc";
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext(), key);

		System.out.println("C10!!!");
		System.out.println("username: "+request.getParameter("username"));
		System.out.println("response: "+response);
		try {
			writer.write(Cons.SUCCESS);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
