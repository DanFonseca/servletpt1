<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.servlets.Empresa"%>
<%@page import="java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas:</title>
</head>
<body>
	<ul>
	
		<c:forEach  var="lista" items="${listaEmpresas}">
		<li> ${lista.nomeEmpresa}</li>
		</c:forEach>
	
	
	</ul>

</body>
</html>