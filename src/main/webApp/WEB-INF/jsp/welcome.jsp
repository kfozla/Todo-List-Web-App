<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <title>Welcome Page </title>
</head>
<body>
    <div class ="container">
        <div>Welcome ${name}</div>
            <hr>
        <a href="list-todos">Manage</a> your todos
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>