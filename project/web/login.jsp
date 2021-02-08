<%-- 
    Document   : login
    Created on : Feb 5, 2021, 5:41:51 PM
    Author     : BKU computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            form{
                width: 30%;
                position: absolute;
                left: 35%;
            }
        </style>
    </head>
    <body>
        <form action="/login" method="post">
            <fieldset>
                <legend>Log In</legend>
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="" class="form-control" placeholder="" aria-describedby="helpId">
                    <small id="helpId" class="text-muted">Help text</small>
                    <br>
                    <label for="password">Password</label>
                    <input type="password" name="password" id="" class="form-control" placeholder="" aria-describedby="helpId">
                    <small id="helpId" class="text-muted">Help text</small>
                    <br>
                    <button type="submit" class="btn btn-primary">Log In</button>
                </div>
            </fieldset>
        </form>

    </body>
</html>
