 
<%@ page import= "java.util.Date,java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/functions" prefix= "fn" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>

<!DOCTYPE html>

 
 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  
   JSP Directives-> messages that tells the web container like
   how to transalte a jsp page into the corresponding servlet
   page directive
   include directive-> include the contents of any resource
   taglib directive-> custom tags or predefined tags from jstl
 -->
 <%@ include file="Header.html" %>
     Today date is : <%= new Date() %><br/>
    
    <c:set var="string" value="Welcome to JSP"/>
      ${fn:toLowerCase("WELCOME")}
      ${fn:toUpperCase(string)}
 
</body>
</html>