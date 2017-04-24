<%-- 
    Document   : index
    Created on : Apr 2, 2017, 11:24:15 AM
    Author     : RANJIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! this is me Spring</h1>
    </body>
    <a href="${pageContext.request.contextPath}/admin/course/add">Add Course</a> </br>
    <a href="${pageContext.request.contextPath}/admin/user/add">Add User</a>
    <a href="${pageContext.request.contextPath}/admin/course/display">Display Course</a>
</html>
