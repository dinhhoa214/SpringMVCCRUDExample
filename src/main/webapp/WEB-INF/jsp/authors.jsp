<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="addAuthor" value="/authors/add" />
	<form:form action="${addAuthor}" commandName="author">
		<table>
			<tr>
				<td><form:label path="id">Id :
					</form:label></td>
				<td><form:input path="id" readonly="true" size="8"
						disabled="true" /> <form:hidden path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="authorName">Name: 
					</form:label></td>
				<td><form:input path="authorName" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Add Author" /></td>
			</tr>
		</table>
	</form:form>
	<h3>Person list</h3>
	<c:if test="${!empty authors}">
		<table>
			<tr>
				<th width="100">Author id</th>
				<th width="200">Author name</th>
			</tr>
			<c:forEach items="${authors}" var="a">
				<tr>
					<td align="center">${a.id}</td>
					<td align="center">${a.authorName}</td>
					<td align="center">
							<a href="<c:url value ='/authors/remove/${a.id}'/>">Delete</a>					
					</td>
					<td align="center">
							<a href="<c:url value ='/authors/edit/${a.id}'/>">Edit</a>					
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
</body>
</html>