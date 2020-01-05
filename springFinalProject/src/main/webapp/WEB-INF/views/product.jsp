<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="resources/css/project.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div id="total">
	<div id="top">
		<jsp:include page="/top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="/top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<h2>상품 정보</h2>
		<table>
		<tr>
			<td>순서</td>		
			<td>상품명</td>		
			<td>가격</td>		
			<td>그림</td>		
		</tr>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.id}</td>		
			<td><a href=one?id=${dto.id}>${dto.title}</a></td>		
			<td>${dto.price}</td>		
			<td><img src="resources/img/${dto.img}" width=100 height="100"></td>		
		</tr>
		</c:forEach>
		</table>
	</div>
</div>

</body>
</html>



