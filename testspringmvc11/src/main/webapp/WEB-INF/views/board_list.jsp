<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <p>게시물 목록</p>
       
       <ul>
 <%
     for(int i=1; i<=10; i++){
 %>
        <li><%=i%> 제목<%=i%> 작성자<%=i%></li> 
 <%    	 
     }
 %>      
       </ul>
       
</body>
</html>