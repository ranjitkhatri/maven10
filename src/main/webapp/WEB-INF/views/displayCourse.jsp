<%-- 
    Document   : display
    Created on : Apr 7, 2017, 10:49:45 AM
    Author     : RANJIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Course Information </h1>
        <table>
            <thead>
            <th>Course Id</th>
            <th>Course Title</th>
            <th>Course Price</th>
            <th>Course Duration </th>
            <th>Edit </th>
            <th>Delete </th>
        </thead>
        <tbody>
            <c:forEach items="${coursedata}" var="course">
                <tr>
                    <td> ${course.courseid} </td>
                    <td>${course.coursetitle}</td>
                    <td>${course.price}</td>
                    <td>${course.duration}</td>
                    <td><a href="${pageContext.request.contextPath}/admin/course/edit/${course.courseid}">Edit</a></td>
                    <td><a href="${pageContext.request.contextPath}/admin/course/delete/${course.courseid}">Delete</a></td>

                </tr>
            </c:forEach>    
        </tbody>

    </table>

</body>
</html>
