<html>
<body>
<h2>JSP</h2>
<!-- Scriptlet tag -->
<%   out.println("Welcome JSP"); %>
<br/>

<%   out.println(10*5); %>
<br/>
<!-- Expression tag -->
<%= java.util.Calendar.getInstance().getTime()  %>
<br/>

<!-- Declaration tag -->
<%!   int square(int x){ return x*x;}	%>
<%=  "Square of 12 is :"+square(12) %>

</body>
</html>
