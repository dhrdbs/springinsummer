<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<style type="text/css">
.button {
	color: #333333;
	background-color: #ecffd6;
	border-color: #4e9e31;
}

.button:hover {
	color: #333333;
	background-color: #b8d696;
	border-color: #4e9e31;
}

.show>.dropdown-toggle {
	color: #fff;
	background-color: #92C350;
	border-color: #92C350;
}

.search-button {
	height: 40px;
	width: 70px;
	color: #333333;
	background-color: #b8d696;
	border-color: #4e9e31;
}

.search-button:hover {
	color: #333333;
	background-color: #92C350;
	border-color: #4e9e31;
}

.search-form {
	height: 40px;
	width: 500px;
	border: 1px solid #4e9e31;
	padding: .375rem .75rem;
	border-radius: .25rem;
}

.hashTag {
	color: #fff;
	background-color: #92C350;
}

.hashTag:hover {
	color: #fff;
	background-color: #77974B;
}

.card {
	position: relative;
	background-color: #F2FAE6;
	border-radius: .25rem;
}

.navbar {
	justify-content: center;
}
</style>

<title>HEW_articleInput</title>
</head>
<body class="bg-light">
	<div>
		<div class="container">
			<!-- MenuBar(NavBar) 시작 -->
			<header class="blog-header py-3">
			<div
				class="row flex-nowrap justify-content-between align-items-center">
				<div class="col-4 pt-1"></div>
				<div class="col-4 text-center">
					<a class="blog-header-logo text-dark" href="/">LOGO</a>
				</div>
				<div class="col-4 d-flex justify-content-end align-items-center">
					<ul class="list-unstyled">
						<!-- 회원가입 -->
						<a class="nav-link btn btn-sm btn-underline-secondary"
							href="/hew/member/register"><u>Register</u></a>

						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle btn btn-sm button" href="#"
							id="navbarDropdownMenuLink" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"> Login </a> <!-- Login Form -->
							<div class="dropdown-menu"
								style="padding: 15px; padding-bottom: 10px; width: 300px;">
								<form class="form-horizontal" method="post"
									accept-charset="UTF-8">
									<input class="form-control login" type="text" name="id"
										placeholder="ID.."><br> <input
										class="form-control login" type="password" name="password"
										placeholder="Password.."><br> <input
										class="btn button" type="submit" name="submit" value="Login">
								</form>
							</div></li>
					</ul>
				</div>
			</div>
			</header>
			<hr>
			<div class="nav-scroller">
				<nav class="nav d-flex justify-content-center"> <a
					class="p-2 text-muted" href="/hew/error_report/listAll">My
					error Report</a> <a class="p-2 text-muted" href="#">QnA</a> </nav>
			</div>
			<!-- MenuBar(NavBar) 끝 -->
			<br>

			<div class="container">
				<div class="row">

					<div class="col-xs-6 col-md-10">
						<h3 class="text-center text-muted">글 목록</h3>
					</div>
					<div class="col-xs-6 col-md-2">
						<a class="btn button " href="/hew/error_report/write" role="button">글쓰기</a>
					</div>
				</div>
				<br>
			</div>

			<!-- 검색창  -->

			<div class="container">

				<form class="navbar" >
					<SELECT name='searchType'>
						<!-- 검색 컬럼 -->
						<OPTION value='all'  <c:out value="${map.searchType=='all'?'selected':'' }"/>>전체 목록</OPTION>
						<OPTION value='title' <c:out value="${map.searchType=='title'?'selected':'' }"/>>제목</OPTION>
						<OPTION value='error_code' <c:out value="${map.searchType=='error_code'?'selected':'' }"/>>error code</OPTION>
						<OPTION value='hashtag' <c:out value="${map.searchType=='hashtag'?'selected':'' }"/>>hashtag</OPTION>
						<OPTION value='title-error_code'>제목+error code</OPTION>
					</SELECT> 
					<input type="text" placeholder="검색어를 입력하세요" name="searchWord"
						class="search-form" value="${map.searchWord}">
					<button type="submit" class="btn search-button">검색</button>
				</form>
			</div>

			<div class="container-fluid">
				<div class="row" style="padding: 30px;">
					<div class="col-md-12">
						<div class="row">
							<c:forEach var="list" items="${map.list }" varStatus="status">

								<div class="col-md-4" style="padding-top: 15px;">
									<div class="card rounded text-center ">
										<h5 class="card-header">
											<a href='/hew/error_report/view?eno=${list.eno }'
												onClick='fn_view(${list.eno})'><c:out
													value="${list.title }" /></a>
										</h5>
										<div class="card-body">
											<h6>error_code</h6>
											<p class="card-text">
												<c:out value="${list.error_code }" />
											</p>
											<hr>
											<h6>solution</h6>
											<p class="card-text">
												<c:out value="${list.solution }" />
											</p>
										</div>

										<div class="card-footer">
											<button class="btn hashTag">#java</button>

										</div>
									</div>
								</div>
							</c:forEach>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!-- footer -->
	<footer class="container">
	<hr>
	<p class="float-right">
		<a href="#">Back to top</a>
	</p>
	<p>
		©2019 Company, Inc. SpringInSummer · <a href="#">Privacy</a> · <a
			href="#">Terms</a>
	</p>
	</footer>
	</div>

</body>
</html>