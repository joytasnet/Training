<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%
		Random rand=new Random();
		String[] fortunes={"大吉","中吉","小吉","凶"};
		int index=rand.nextInt(fortunes.length);
		String fortune=fortunes[index];
		String className="";
		switch(index){
		case 0:
			className="dai";
			break;
		case 1:
			className="chu";
			break;
		case 2:
			className="sho";
			break;
		case 3:
			className="kyo";
			break;
		}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>FortunesApp</title>
</head>
<body>
<p class="<%=className%>">あなたの運勢は<%=fortune %>です</p>
</body>
</html>