<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Todos Page </title>
</head>
<body>
    <div>Welcome ${name}</div>
    <hr>
    <h1>Your Todos</h1>
    <table>
    <thead>
        <tr>
            <th>id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done</th>
        </tr>
    </thead>
        <c:forEach items ="${todos}" var = "todo">
        <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>