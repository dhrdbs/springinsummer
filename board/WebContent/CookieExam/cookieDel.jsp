<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String cookieName = request.getParameter("cookieName");
	//쿠키를 삭제하기 위해서는 똑같은 이름의 쿠키객체를 만들어서 유지시간을 0으로 바꿔서 client에게 보낸다.
	Cookie cookie = new Cookie(cookieName,"");
	cookie.setPath("/");
	cookie.setMaxAge(0);
	
	response.addCookie(cookie);
	response.sendRedirect("CookieView.jsp");
	
	
	session.removeAttribute("login");
	session.invalidate();
%>