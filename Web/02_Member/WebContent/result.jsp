<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getParameter("addr")%> 사는
 <%= request.getParameter("age") %> 세인
<%= request.getParameter("name") %> 가입완료!

</body>
</html>