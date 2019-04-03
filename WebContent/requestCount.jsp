<%@page pageEncoding="UTF-8"%>
<%@page import="listener.requestlistener"%>
<html>
	<head><title>请求和销毁对象数</title></head>
	<body>
		<h2>当前请求对象总数：<%=requestlistener.getonlineCount() %></h2>
		<h2>当前销毁对象总数:<%=requestlistener.getofflineCount() %></h2>
	</body>
</html>