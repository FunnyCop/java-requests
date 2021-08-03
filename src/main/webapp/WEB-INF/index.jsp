<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <title>index</title>
    
    <link rel = "stylesheet" type = "text/css" href = "css/style.css" />
</head>

<body>

    <form action = "/submit" method = "POST">

    	<c:choose>
    		<c:when test = "${empty error}"></c:when>
    		<c:otherwise><p style = "color: red;">${ error }</p></c:otherwise>
    	</c:choose>

    	<p>What is the code?</p>
    	<input type = "password" name = "code" />
    	<input type = "submit" value = "Submit" />
    </form>

</body>

</html>