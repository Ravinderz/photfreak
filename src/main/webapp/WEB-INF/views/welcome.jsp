<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome <c:out value = "${User.username}"></c:out></h1>
<div class = "navlist">
<ul>
<li><a href="/PhotoFreak/navlisthtml/1">Nature</a></li>
<li><a href="/PhotoFreak/navlisthtml/2">Abstract</a></li>
<li><a href="/PhotoFreak/navlisthtml/3">Cats</a></li>
<li><a href="/PhotoFreak/navlisthtml/4">Pups</a></li>
</ul>
</div>
</body>
</html>