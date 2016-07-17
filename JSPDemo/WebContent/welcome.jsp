<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- This is JSP Scriptlet Example --%>
<%--
String name=request.getParameter("uname");  
out.print("welcome "+name);  
--%> 

<%   
out.print("Welcome "+request.getParameter("uname"));  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%> 
<%-- This is JSP Expression Example --%>
Current Time: <%= java.util.Calendar.getInstance().getTime() %>   
</body>
</html>