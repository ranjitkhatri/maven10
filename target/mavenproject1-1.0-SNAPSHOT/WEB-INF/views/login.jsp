<%-- 
    Document   : login
    Created on : Apr 13, 2017, 11:38:28 AM
    Author     : RANJIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contentPath}/j_spring_security_check" method="POST">
        
            <p>
                <input type="test" name="j_username" placeholder="Enter you UserName"/>
            </p>
            <p>
                <input type="password" name="j_password" placeholder="Enter your password" />
            </p>
            <p>
                <input type="submit" value="Log In">
            </p>
        
        </form>
    </body>
</html>
