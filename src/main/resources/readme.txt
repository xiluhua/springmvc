访问首页：http://localhost:7008/springmvc/
报错：
	NoSuchMethodError: javax.servlet.http.HttpServletResponse.getStatus()I

解决：
	参考 https://blog.csdn.net/szwangdf/article/details/42145463
	
	Spring V4.1.0+的版本在不支持Servlet3.0的应用服务器上跑时会报这样的错误。
	
	比如说：tomcat 7以下的版本、jboss 4.2.3以下的版本
	
	
		解决版本有两个（任意选一个即可）：
		
		1）、退回到Spring V4.0.7
		
		2）、升级应用服务器到支持Servlet3的应用服务器。
		
		         比如tomcat7+（最好是tomcat8+）、jboss as 7+	