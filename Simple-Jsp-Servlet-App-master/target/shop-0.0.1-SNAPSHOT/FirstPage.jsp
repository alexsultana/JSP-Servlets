<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page errorPage="error.jsp"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Online Shop</title>
</head>

<body>
	<%@ include file="header.jsp"%>
	</br></br></br>
	<a href="<c:url value="/home" />"> <input type="button"
		value="View Available Products" /></a>
</br></br></br>
	<a href="<c:url value="/cart" />"> <input type="button"
		value="View The Shopping cart" /></a>

</body>

</html>