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
		<h2 class="tit">CONVERTA UM NUMERO ROMANO PARA DECIMAL</h2>
		<form id="cnrvtRomano" action="enviarDados" method="post">
			<label> Introduza o Numero Romano : </label> <input type="text"
				name="valor" id="valor"> <input type="submit"
				value="Converter" name="btnCon" id="btnCon">
			<form:errors path="numeroRomano.valor" cssClass="error"></form:errors>
		</form>
	</div>
	<div>
		<p class="smallText"> NOME:  Yuri Jorge Jimes Wingester </p>
	</div>
</body>
</html>