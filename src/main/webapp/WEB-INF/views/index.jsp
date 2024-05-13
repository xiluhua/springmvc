<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${base}/css/bootstrap.5.3.0.min.css">
<script type="text/javascript" src="${base}/javascript/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${base}/javascript/bootstrap.5.3.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#C19").click(function(){
		var url = '${base}/C19'
		var arg = {};
		$.post(url, arg, function(data){
			alert(JSON.stringify(data))
		});
	})
})

</script>
<title>首页</title>
</head>
<body>
	<h1>首页</h1>
    <h3>美食</h3>
<%--    nginx 动静分离测试用 begin --%>
    <button type="button" class="btn btn-primary">Primary</button>
    <button type="button" class="btn btn-secondary">Secondary</button>
    <button type="button" class="btn btn-success">Success</button>
    <button type="button" class="btn btn-danger">Danger</button>
<%--    <button type="button" class="btn btn-warning">Warning</button>--%>
<%--    <button type="button" class="btn btn-info">Info</button>--%>
<%--    <button type="button" class="btn btn-light">Light</button>--%>
<%--    <button type="button" class="btn btn-dark">Dark</button>--%>
    <img src="${base}/img/food.jpg" height="400px" width="500px"/>
    <%--    nginx 动静分离测试用 over   --%>
    <hr>
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
    <a href="${base}/success">Test directly jump to some Page</a>
    <br>
    <a href="${base}/C14">TestC14.BeanNameViewResolver</a>
    <br>
    <a href="${base}/C15">TestC15.Redirect</a>
    <br>
    <a href="${base}/C16">TestC16.Forward</a>
    <br>
    <form action="${base}/C17" method="post">
		姓名：<input type="text" value="Tom" name="username">
		性别：<input type="text" value="2"   name="gender">
		年龄：<input type="text" value="18"  name="age">
		生日：<input type="text" value="2010-08-10"  name="birth">
        <input type="submit" value="TestC17.initBinder">
    </form>
    <br>
    <form action="${base}/C18" method="post">
		姓名：<input type="text" value="Tom" name="username">
		性别：<input type="text" value="2"   name="gender">
		年龄：<input type="text" value="18"  name="age">
		生日：<input type="text" value="2010-08-10"  name="birth">
        <input type="submit" value="TestC18.DateTimeFormat">
    </form>
    <br>
    <a href="javascript:void(0)" id="C19">TestC19.json</a>
    <br>
    
    <form action="${base}/C20" method="post" enctype="multipart/form-data">
		文件：<input type="file" value=""      name="file">
		描述：<input type="text" value="abc"   name="desc">
        <input type="submit" value="TestC20.RequestAndResponseBody">
    </form>
    <br>
    <a href="${base}/C21">TestC21.ResponseEntity</a>
    <br>
	<form action="${base}/C22" method="post" enctype="multipart/form-data">
		文件：<input type="file" value=""      name="file">
		描述：<input type="text" value="abc"   name="desc">
        <input type="submit" value="TestC22.FileUpload">
    </form>
    <br>
    <a href="${base}/C23?i=0">TestC23.ExceptionHandler</a>
    <br>
    <a href="${base}/C24?i=0">TestC24.ResponseStatus</a>
    <br>
    <a href="${base}/C25?i=2">TestC25.SimpleMappingExceptionResolver</a>
    <br>
</body>
</html>