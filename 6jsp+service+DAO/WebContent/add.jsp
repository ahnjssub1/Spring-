<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Board"%>
<%@ page import="service.게시물업무"%>
<%
  //1.요청 (제어) 
  String 제목=request.getParameter("title");
  String 내용=request.getParameter("contents");
  Board board = new Board();
  //board.setTitle(제목);
  //board.setContents(내용);
  
  //2.(업무요청) 직접 업무X
   게시물업무  업무=new 게시물업무();
   업무.등록하다(board);
  
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 3.(view)  -->
  등록되었습니다.<!-- 응답 화면생생성  -->
</body>
</html>