<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <style>
        * {
            font-family: sans-serif;
        }
    </style>

    <title>Form</title>
</head>
<body>
<h2>Your deatail</h2>

<form:form action="showDetails" modelAttribute="employee">
    <form:input path="name"/> Name
    <form:errors path="name" cssStyle="color: #ff0000"/>
    <br><br>
    <form:input path="surname"/> Surname
    <form:errors path="surname" cssStyle="color: #ff0000"/>
    <br><br>
    <form:input path="salary"/> Salary
    <form:errors path="salary" cssStyle="color: #ff0000"/>
    <br><br>
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Witch Car You have ?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Languages:
    <form:checkboxes path="lang" items="${employee.langs}"/>
    <br><br>
    <form:input path="phoneNumber"/> PhoneNumber
    <form:errors path="phoneNumber" cssStyle="color: #ff0000"/>
    <br><br>
    <form:input path="email"/> Email
    <form:errors path="email" cssStyle="color: #ff0000"/>
    <br><br>
    <input type="submit" value="ok">
</form:form>


</body>
</html>