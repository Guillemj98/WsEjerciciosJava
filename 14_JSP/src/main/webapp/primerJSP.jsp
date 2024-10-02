<!-- Esto es un servlet aunque no lo parezca  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primer JSP</title>
</head>
<body>
 	<h1> Nuestro primer JSP</h1>
 	<h2>Bienvenido</h2>
 	<h2>Bienvenido</h2>
 	<h2>Bienvenido</h2>
 	<h2>Bienvenido</h2>
 	<h2>Bienvenido</h2>
 	<!-- Esto es un scriptker y estan deprecados
 	y es simplemente incrustar código java en un JSP -->
 	
 	<%
 	int numero1 = 5;
 	for(int i = 0; i <= numero1 ; i ++){
 	%>
 	<h2>Bienvenido</h2>
 	<%
 	}
 	%>
 	<form action="primerJSP.jsp" method="POST">
		Numero de repeteciones: <input type ="number" name="repeticion"/> 
		<input type= "submit" value= "Enviar repeticiones al servidor">	
 	</form>
 	<%
 	
 	String parametro1 = request.getParameter("repeticion");
 	int repeticion = 0; 
 	try{
 	repeticion = Integer.parseInt(parametro1);
 	}catch(Exception e){
 		
 	}
 	for(int i = 1; i <= repeticion ; i ++){
 	%>
 	<h3 style ="color:red">Repeticion numero: <%=i%></h3>
 	<%
 	}
 	%>
 	
 	
</body>
</html>