<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  //1.요청 (제어) 
  String 제목=request.getParameter("title");
  String 내용=request.getParameter("contents");
  //2.(업무) 
  //  2.1.업무규칙검사 
          System.out.println("업무 규칙 검사 코드 실행 완료");
  //  2.2.(DB) 처리
          //jdbc 코드
          System.out.println("DB에 저장 코드 실행 완료");  
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 3.(view) 응답 화면생성 -->
  등록되었습니다.
</body>
</html>