<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado da Operacao</title>
<link rel="stylesheet" 	href='<c:url value="/resources/css/custom.css"></c:url>'>
</head>
<body>
	<div class="container">
		<p>O resultado da opera&ccedil;&atilde;o &eacute; a seguinte :</p>
		<br />
		<p class="titBig">${resultado}</p>
	
	<form action="converter" method="post">
			<input type="submit" value="Converter Novamente">
	</form>
	</div>
</body>
</html>