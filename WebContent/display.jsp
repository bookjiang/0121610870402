<%@ page contentType="text/html;charset=utf-8"%>  
<jsp:useBean id="book" class="beans.BookBean" scope="session"/>
<html> 
	<center>
		<body>
		       书号：<jsp:getProperty name="book" property="bookid"/><br>
		        书名：<jsp:getProperty name="book" property="title"/> <br>    
		        作者：<jsp:getProperty name="book" property="author"/>  <br>     
		        出版社：   <jsp:getProperty name="book" property="publisher"/>    <br> 
		        价格： <jsp:getProperty name="book" property="price"/> 
		 </body> 
	 </center>
</html>