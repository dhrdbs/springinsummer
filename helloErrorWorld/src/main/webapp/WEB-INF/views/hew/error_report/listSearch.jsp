<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	<SELECT name='col'>
		<!-- 검색 컬럼 -->
		<OPTION value='none'>전체 목록</OPTION>
		<OPTION value='title'>제목</OPTION>		
	</SELECT>

	<form action="/hew/error_report/listAll/listSearch" method="get">
		<input type="text" name="keyword"> <input type="submit"
			value="검색">
	</form>
</body>
</html>