<%-- 
    Document   : addcourse
    Created on : Apr 4, 2017, 11:10:26 AM
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
        <h3> Add Course </h3>
        <form action="${pageContext.request.contextPath}/admin/course/save" method="POST">
            <p> Title: <input type="text" name="title" placeholder="Enter title"/> </p>
            <p> Price <input type="text" name="price" placeholder="Enter price"/> </p>
            <p> Duration : <input type="text" name="duration" placeholder="Enter duration"/> </p>
            <P>Syllabus: <input type="file" name="syllabus"> </P> 
            <p><input type="submit" value="Upload"> </p>
            <p><input type="submit" value="Add Course"/> </p>
            
            
        </form>
    </body>
</html>
