<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="shop.vo.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 상세 조회</title>
<style type="text/css">
	table, tr, th, td {
		border: 1px solid black;
	}
</style>
</head>
<body>
<h3>제품 상세 조회</h3>
<hr>
<table>
	<tr>
		<th>제품 코드</th>
		<td>${product.prodCode}</td>
	</tr>
	<tr>
		<th>제품 이름</th>
		<td>${product.prodName}</td>
	</tr>
	<tr>
		<th>가격</th>
		<td>
			<fmt:formatNumber value="${product.price}" type="currency" />
		</td>
	</tr>
	<tr>
		<th>재고</th>
		<td>${product.quantity}</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align: right;">			
			<a href="update?prodCode=${product.prodCode}">수정</a>
			<a href="delete?prodCode=${product.prodCode}">삭제<br/></a>
			<a href="list">목록보기<br/></a>
			<a href="menu">메뉴로 돌아가기<br/></a>
		</td>
	</tr>
	
</table>

</body>
</html>