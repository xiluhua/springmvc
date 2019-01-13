<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
</head>
<body>
	<h1>首页</h1>
	<a href="${base}/B1">TestB1.@RequestMapping.on.method</a>
	<br>
	<a href="${base}/2/B2">TestB2.@RequestMapping.on.class</a>
	<br>
    <form action="${base}/B3" method="post">
        <input type="submit" value="TestB3.@RequestMapping.POST">
    </form>
    <br>
    <a href="${base}/B4?username=zhangsan&age=1">TestB4.@RequestMapping.on.params</a>
    <br>
    <a href="${base}/B7/1">TestB7.@PathVariable</a>
    <br>
    <a href="${base}/B8?username=zhangsan&age=18">TestB8.@RequestParam</a>
    <br>
 	<form action="${base}/B9" method="post">
 		姓名：<input type="text" value="" name="username">
 		性别：<input type="text" value="" name="gender">
 		城市：<input type="text" value="" name="addr.city">
 		马路：<input type="text" value="" name="addr.road">
        <input type="submit" value="TestB9.Pojo">
    </form>
    <br>
    <a href="${base}/C10?username=zhangsan">TestC10.servletApi</a>
    <br>
    <a href="${base}/C11?username=zhangsan">TestC11.modelAndView</a>
    <br>
    <a href="${base}/C12?username=zhangsan">TestC12.map</a>
    <br>
    <%--
        模拟操作：
        1. 原始数据：Tom，1，18
        2. 性别不能被修改
        3. 表单回显，模拟操作直接在表单填写对应的属性值
    --%>
    <form action="${base}/C13" method="post">
		姓名：<input type="text" value="Tom" name="username">
		性别：<input type="text" value="2"   name="gender">
		年龄：<input type="text" value="18"  name="age">
        <input type="submit" value="TestC13.modelAttribute">
    </form>
    <br>
</body>
</html>