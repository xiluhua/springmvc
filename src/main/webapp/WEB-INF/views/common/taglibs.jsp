<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="base" value="${pageContext.request.contextPath}" />
<c:set var="datePattern">yyyy-MM-dd</c:set>
<%
	String serverDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
%>
<c:set var="serverDateTime" value="<%=serverDateTime%>"></c:set>