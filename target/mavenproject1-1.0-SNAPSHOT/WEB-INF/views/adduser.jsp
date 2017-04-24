<%-- 
    Document   : adduser
    Created on : Apr 4, 2017, 9:24:31 PM
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
       <h3> Add User </h3>
        <form action="" method="POST">
            <p> UserName: <input type="text" name="username" placeholder="Enter your name"/> </p>
            <p> Password <input type="text" name="password" placeholder="Enter password min 4 character"/> </p>
            <p> RePassword <input type="text" name="repassword" placeholder="Enter password min 4 character"/> </p>
                    <p> Type : <select>
                            <option> Admin </option>
                            <option> User </option>
                </select> </p>
            <p><input type="submit" value="Add User"/> </p>
            
            
        </form>
    </body>
</html>
