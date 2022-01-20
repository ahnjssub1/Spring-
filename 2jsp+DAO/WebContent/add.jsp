<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Board"%>
<%@ page import="dataservice.게시물DAO"%>
<%
  //1.요청 (제어) 
  String 제목=request.getParameter("title");
  String 내용=request.getParameter("contents");
  Board board = new Board();
  //board.setTitle(제목);
  //board.setContents(내용);
  
  //2.(업무) 
  //  2.1.업무규칙검사 
          System.out.println("업무 규칙 검사 코드 실행 완료");
  //  2.2.(DB) 처리
            게시물DAO dao = new   게시물DAO();
      dao.저장하다(board);
  
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