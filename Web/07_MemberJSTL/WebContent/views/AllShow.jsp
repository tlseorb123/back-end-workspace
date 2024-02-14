<%@page import="com.kh.model.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<H1>전체 회원 목록</H1>
<c:forEach items="${list}" var="m">
	<tr>
		<td>${m.id}</td>
		<td>${m.name}</td>
		<td>${m.password}</td>
	</tr>
</c:forEach>
	<table>
	
	<a href="/index.jsp">첫 페이지 이동</a>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>비밀번호</th>

		</tr>
	</table>
</body>
</html>