<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Sign Up</h1>

<form:form action="/PhotoFreak/register"  modelAttribute="user">

<label for="firstNameInput">First Name: </label>
<form:input path="firstName" id="firstName"></form:input>
<form:errors path="firstName" cssclass="error"></form:errors>
<br />

<label for="lastNameInput">Last Name: </label>
<form:input path="lastName" id="lastName"></form:input>
<form:errors path="lastName" cssclass="error"></form:errors>
<br />

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