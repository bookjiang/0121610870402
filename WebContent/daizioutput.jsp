<%@ page pageEncoding="UTF-8" %>
<%@page import="listener.requestlistener"%>
<html>
	<head><title>你好</title></head>

		<body>
			<center>
			<%="你才是"+request.getAttribute("r")%><br>
			<h2>当前请求对象总数：<%=requestlistener.getonlineCount() %></h2>
		<h2>当前销毁对象总数:<%=requestlistener.getofflineCount() %></h2>
			</center>
		</body>


</html>