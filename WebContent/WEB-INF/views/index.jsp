<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Converter Numero</title>
<link rel="stylesheet"
	href='<c:url value="/resources/css/custom.css"></c:url>'>
</head>
<body>
	<div class="container">
		<h2 class="tit">Bem vindo ao Conversor de Numeros Romanos  para Decimal </h2>
		<p class="smallText"> NOME DO DESENVOLVEDOR:  Yuri Jorge Jimes Wingester </p>
		<p class="smallText"> Sala de Cima</p>
		<form action="converter" method="post">
			<input type="submit" value="Converter Numero">
		</form>
	</div>
	<div>
		
	</div>
</body>
</html>