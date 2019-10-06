<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.servlets.Empresa"%>
<%@page import="java.util.List"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas:</title>
</head>
<body>
<ul>

<%
 List <Empresa> listEmpresa = (List<Empresa>) request.getAttribute("listaEmpresas");
	for (Empresa empresa : listEmpresa){
		%>
		<li> <%= empresa.getNomeEmpresa() %> </li>
		<%
	}

%>

</ul>

</body>
</html>