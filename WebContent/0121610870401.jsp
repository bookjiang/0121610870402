<%@page  contentType="text/html" import="java.util.*" pageEncoding="UTF-8" %>
<html>
	<head>
		<title>ä½ä¸2</title>
	</head>
	<body>
		<center>
			<%
				Date today=new Date();
				int year0=today.getYear();
				int year=year0+1900;
				int month0=today.getMonth();
				int month=month0+1;
				int date=today.getDate();
				int day=today.getDay();
				int hours=today.getHours();
				int minutes=today.getMinutes();
				int seconds=today.getSeconds();
				if(hours>=0&&hours<12){
					out.println("早上好！");
				}else if(hours>=12&&hours<19){
					out.println("ä¸åå¥½ï¼");
				}else
					out.println("晚上好");
				out.println("<br>ç°å¨æ¯ï¼"+year+"å¹´"+month+"æ"
				+date+"æ¥ææ"+day+"<br>"+hours+"æ¶"+minutes+"å"
				+seconds+"ç§");
			%>
		</center>
	</body>
</html>