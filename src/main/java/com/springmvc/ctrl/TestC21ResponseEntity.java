package com.springmvc.ctrl;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestC21ResponseEntity {

	@RequestMapping(value="C21")
	public ResponseEntity<byte[]> test(HttpSession session) throws IOException {
		System.out.println("C21!!!");
		ServletContext sc   = session.getServletContext();
		InputStream in      = sc.getResourceAsStream("/files/abc.txt");
		byte[] body         = new byte[in.available()];
		in.read(body);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attatchment;filename=abc.txt");

        HttpStatus status   = HttpStatus.OK;

        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(body, headers, status);

		return responseEntity;
	}
	
}
