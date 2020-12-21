<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i=0;i<10;i++){ %>
<p>Hello</p>
<%} %>
<% int i=1;
System.out.println(i);
out.print(i);

%>
<% if(i==1){ %>
	<p>iは1です</p>
<%}else if(i==2){ %>
	<p>iは2です</p>
<%}else{ %>
	<p>iは3です</p>
<%} %>
</body>
</html>