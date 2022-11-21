<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String s = "https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001557?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001556?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001558?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001555?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1013171_1667742567362_1000001468?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	StringTokenizer st = new StringTokenizer(s, "^");
	while(st.hasMoreTokens()) {
%>

<img src="<% st.nextToken(); %>">

<% 
	}
%>		

</body>
</html>