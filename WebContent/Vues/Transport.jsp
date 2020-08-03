<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="chercher.do" method="get">
Mot clé:<input type="text" name="motCle">
<input type="submit" value="ok">
</form>
<table border="1" width="90%">
<tr>
<th>Num</th><th>Nom</th><th>poids</th><th>Vol</th><th>Ref Cargaison</th>
<c:forEach items="${marchandises}" var="m">
<tr>
<td>${m.numero}</td>
<td>${m.nom}</td>
<td>${m.poids}</td>
<td>${m.volume}</td>
<td>${m.cargaison.reference}</td>
</tr>

</c:forEach>
</table>
</body>
</html>