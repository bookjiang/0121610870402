<%@page  contentType="text/html" import="java.util.*" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>homework-jsp</title>
    </head>
    
    <body align="center">
    <center>
        <%
            Date today=new Date();
            int year=today.getYear()+1900;
            int month=today.getMonth()+1;
            int date=today.getDate();
            int day=today.getDay();
            int hours=today.getHours();
            int minutes=today.getMinutes();
            int seconds=today.getSeconds();
            if(hours>=0&&hours<12)
            {
                out.println("早上好!");
            }
            else if(hours>=12&&hours<18)
            {
                out.println("下午好!");
            }
            else
            {
                out.println("晚上好!");
            }
            out.println("<br>现在是："+year+"年"+month+"月"+date+"日星期"+day+"<br>"+hours+"时"+minutes+"分"+seconds+"秒");
        %>
        </center>
    </body>
</html>