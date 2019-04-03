<!-- Templates.jsphtml5.content! -->
<%@ page pageEncoding="UTF-8" %>
<%@page import="listener.requestlistener"%>
<html>
	<head><title>显示圆面积页面</title></head>

		<body>
			<center>
			<h1>面积为</h1>
			<%=request.getAttribute("outputMessage") %><br>
			<h1>周长为</h1>
			<%=request.getAttribute("outputMessage1") %>
			<h2>当前请求对象总数：<%=requestlistener.getonlineCount() %></h2>
		<h2>当前销毁对象总数:<%=requestlistener.getofflineCount() %></h2>
			</center>
		</body>


</html>