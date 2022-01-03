<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.stone.springmvc.common.Board" %>
<%
	String 도시명 = (String)request.getAttribute("city");
	int 크기  = (Integer)request.getAttribute("size");
	Board 새게시물 = (Board)request.getAttribute("newBoard");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
도시명:<%=도시명 %>, 크기:<%=크기 %>, 제목은  <%=새게시물.getTitle() %>
<%-- request.getAttribute("newBoard") => ${newBoard.title} --%>
<%-- reguest.getParameter("abc") => ${param.abc} --%>

</body>
</html>