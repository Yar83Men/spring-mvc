<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <style>
        *{
            font-family: sans-serif;
        }
    </style>
</head>
<body>
<h2>Your data</h2>
<a href="/">Home</a>
<%--<h2> Your name: ${param.employeeName}</h2>--%>
<h2> Your name: ${employee.name}</h2>
<h2> Surname: ${employee.surname}</h2>
<h2> Salary: ${employee.salary}</h2>
<h2> Department: ${employee.department}</h2>
<h2> Your car: ${employee.carBrand}</h2>
<h2>
    <ul>
        <c:forEach var="l" items="${employee.lang}">
            <li>${l}</li>
        </c:forEach>
    </ul>
</h2>

<h2> Phone number: ${employee.phoneNumber}</h2>
<h2> Email: ${employee.email}</h2>
</body>
</html>