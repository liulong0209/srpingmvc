<%@page contentType="text/html"%>  
<%@page pageEncoding="UTF-8"%>  
<html>
<head><title>第一个Spring MVC实例</title></head>
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body>
   <h1>您输入的欢迎语是<%=str%></h1>
</body>
</html>