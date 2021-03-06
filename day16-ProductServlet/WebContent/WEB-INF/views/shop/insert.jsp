<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="shop.vo.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 신규 등록</title>
<style type="text/css">
	table, tr, th, td {
		border: 1px solid black;
	}
</style>
</head>
<body>

<h3>제품 신규 등록</h3>
<hr>
<form action="insert" method="post">
<!-- 	table>(tr>th[colspan=2]+(tr>(th+td))*5) -->
	<table>
		<tr>
			<th colspan="2">제품 정보 등록하기</th>
			<tr>
				<th>제품 코드</th>
				<td>
					<input name="prodCode" type="text" required="required" /> 
				</td>
			</tr>
			<tr>
				<th>제품 이름</th>
				<td>
					<input name="prodName" type="text" /> 
				</td>
			</tr>
			<tr>
				<th>가격</th>
				<td>
					<input name="price" type="number" /> 
				</td>
			</tr>
			<tr>
				<th>재고</th>
				<td>
					<input name="quantity" type="number" /> 
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;">
					<input type="submit" value="등록하기">
					<input type="reset" value="초기화">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;">
					<a href="menu">메뉴로 돌아가기</a>
				</td>
			</tt>
		</tr>
	</table>
</form>


</body>
</html>