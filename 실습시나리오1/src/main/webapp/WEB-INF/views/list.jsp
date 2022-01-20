<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.stone.springmvc.common.Board" %>
<%
Board newBoard = (Board)request.getAttribute("newBoard");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>게시물 목록</p>
<ul>

	<li> 제목 ${newBoard.title} 내용${newBoard.contents}</li>	

</ul>
</body>
</html>