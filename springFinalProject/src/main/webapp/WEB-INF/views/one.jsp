<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="resources/css/project.css">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	//body안에 있는 element를 먼저 메모리에 읽어 드리기 dom tree구조로 인식
	$("input").click(function() {
		$.ajax({
			url: "basket",
			data: {
				id: ${dto.id}, //id 넣어주기
				title: "${dto.title}",
				price: ${dto.price}
			},
			success: function(result) {
				alert("ok....!")
				
				//$("#top2").append("<br>" + result)
			}
		
		})
	})
})


</script>
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
			<h2>상품 정보</h2>
			<h3>${dto.title}: ${dto.price} 원</h3>
			<hr color=red>
			<img src="resources/img/${dto.img}">
			<br>
			${dto.content} <br>
			<center>
			<input type="image" src="resources/img/re.png" width="50" height="50">
			</center>
		</div>
	</div>

</body>
</html>