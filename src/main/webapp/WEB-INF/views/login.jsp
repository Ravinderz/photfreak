<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Sign in</h1>

<c:if test="${error}">
<p style="color:red"> invalid credentials</p>
</c:if>

<form:form action="/PhotoFreak/authenticate"  modelAttribute="user">

<label for="usernameInput">Username: </label>
<form:input path="username" id="username"></form:input>
<form:errors path="username" cssclass="error"></form:errors>
<br />

<label for="passwordInput">Password: </label>
<form:input path="password" id="password"></form:input>
<form:errors path="password" cssclass="error"></form:errors>
<br />

<input type="submit" value="Sign Up">

</form:form>
</body>
</html>