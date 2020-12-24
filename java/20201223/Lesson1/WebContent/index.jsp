<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Date,java.text.SimpleDateFormat"%>
<%-- スクリプトレット --%>
<%
//配列宣言
String[] luckArray={"超すっきり","すっきり","最悪"};
int index=(int)(Math.random()*3);
String luck=luckArray[index];

Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
String today=sdf.format(date);

%>
<!DOCTYPE html>
<html>
<head>
<!-- 文字コード指定 -->
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p><%=  %>の運勢は「<%=luck %>」です</p>
</body>
</html>