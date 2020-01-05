<%@page import="java.util.ArrayList"%>
<%@page import="com.kgitbank.mvcfinal.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/css/project.css">

</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="/top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="/top2.jsp"></jsp:include>
		</div>
		<div id="center">
			장바구니 
			<table>
				<tr>
					<td>순서</td>
					<td>상품명</td>
					<td>가격</td>
				</tr>
				<c:forEach var="dto" items="${basket}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.title}</td>
						<td>${dto.price}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>




