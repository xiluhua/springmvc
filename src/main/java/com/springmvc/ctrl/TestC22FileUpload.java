package com.springmvc.ctrl;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.statics.Cons;

@Controller
public class TestC22FileUpload {

	@RequestMapping(value="C22")
	public String test(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile multipartFile) throws IOException {
		System.out.println("C22!!!");
		System.out.println("desc            : "+desc);
		System.out.println("originalFileName: "+multipartFile.getOriginalFilename());
		System.out.println("inputStream     : "+multipartFile.getInputStream());
		return Cons.SUCCESS;
	}
	
}
