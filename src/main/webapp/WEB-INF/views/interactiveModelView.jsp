<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.model.InteractiveModel" %>
<!DOCTYPE html>
<html>
<head>
    <title>Interactive Model View</title>
</head>
<body>
    <h1>Welcome to the interactive model view B^)</h1>
    <form action="interactiveModelView" method="post">
    <label for="firstNum"> First number: </label>
    <b></b>
    <input type="number" id="firstNum" name="firstNum">
    <label for="secondNum"> Second Number: </label>
    <b></b>
    <input type="number" id="secondNum" name="secondNum">
    <label for="thirdNum"> Third number: </label>
    <b></b>
    <input type="number" id="thirdNum" name="thirdNum">
    <b></b>
    <label>Result: ${interactiveModel.result}</label>
    <button type="submit"> Submit </button>
    </form>

    <%-- Add your HTML content and embedded Java code here --%>
</body>
</html>