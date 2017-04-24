<%-- 
    Document   : editcourse
    Created on : Apr 10, 2017, 10:49:36 AM
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
        <h1>Edit Course!</h1>

        <form action="${pageContext.request.contextPath}/admin/course/update" method="POST">

            <!-- you should use the model name attribute in form name to use model attribute-->
            <p><input type="hidden" name="courseid" value="${coursedata.get(0).courseid}"</p>
            <p> Title: <input type="text" name="coursetitle" placeholder="Enter title" value="${coursedata.get(0).coursetitle}"/> </p>
            <p> Price <input type="text" name="price" placeholder="Enter price" value="${coursedata.get(0).price}"/> </p>
            <p> Duration : <input type="text" name="duration" placeholder="Enter duration" value="${coursedata.get(0).duration}"/> </p>
            <p><input type="submit" value="Add Course"/> </p>


        </form>
    </body>
</html>
