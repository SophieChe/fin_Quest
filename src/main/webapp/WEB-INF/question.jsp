<%--
  Created by IntelliJ IDEA.
  User: SChe
  Date: 26.03.2023
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest</title>
</head>
<body>

<form method="Get" action="/nextStep">
    <h2>${requestScope.questionText}</h2>
    <p> Выберите ответ:
        <select name="answer" size="1">
            <option value="${requestScope.answer1ID}">${requestScope.answer1Text}</option>
            <option value="${requestScope.answer2ID}">${requestScope.answer2Text}</option>
        </select>
        <button type="SUBMIT">Ответить</button>
    </p>
</form>
</body>
</html>
