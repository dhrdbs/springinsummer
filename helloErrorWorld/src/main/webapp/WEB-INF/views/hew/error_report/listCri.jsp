<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</style>

<title>HEW_articleInput</title>
</head>
<body>
	<div class="">
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
						<a class="nav-link btn btn-sm btn-underline-secondary" href="/hew/member/register"><u>Register</u></a>

						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle btn btn-sm btn-outline-secondary"
							href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"> Login </a> <!-- Login Form -->
							<div class="dropdown-menu"
								style="padding: 15px; padding-bottom: 10px; width: 300px;">
								<form class="form-horizontal" method="post"
									accept-charset="UTF-8">
									<input class="form-control login" type="text" name="username"
										placeholder="Username.."><br> <input
										class="form-control login" type="password" name="password"
										placeholder="Password.."><br> <input
										class="btn btn-primary" type="submit" name="submit"
										value="Login">
								</form>
							</div></li>
					</ul>
				</div>
			</div>
			</header>
			<hr>
			<div class="nav-scroller">
				<nav class="nav d-flex justify-content-center"> <a
					class="p-2 text-muted" href="/hew/write">My error Report</a> <a
					class="p-2 text-muted" href="#">QnA</a> </nav>
			</div>
			<!-- MenuBar(NavBar) 끝 -->
			<br>
			<div class="row">

				<div class="col-xs-6 col-md-10">
					<h3 class="text-center text-muted">Error 상세 페이지</h3>
				</div>
				<div class="col-xs-6 col-md-2">
					<a class="btn button " href="#" role="button" style="float: right;">삭제</a>
					<a class="btn button " href="#" role="button" style="float: right;">수정</a>
				</div>

			</div>
			<br>
			<form role="form" method="POST">

				<c:forEach var="board" items="${board}" varStatus="status">
					<div class="row rounded shadow-lg">

						<div class="col-md-12"
							style="margin-top: 30px; margin-bottom: 30px;">
							<div class="form-group">
								<label for="error_subject"> 제목 </label>
								<textarea class="form-control" readonly>${board.title}</textarea>
							</div>
							<div class="form-group">
								<label for="error_code"> 오류코드 </label>
								<textarea class="form-control" readonly> ${board.error_code} </textarea>
							</div>
							<div class="form-group">
								<label for="error_solution"> 해결방법 </label>
								<textarea class="form-control" readonly>${board.solution}</textarea>
							</div>
							<div class="form-group">
								<label for="error_etc"> 기타 </label>
								<textarea class="form-control" readonly>${board.etc} </textarea>
							</div>
							<div class="form-group">
								<label for="error_tag"> 해시태그 </label>
								<textarea class="form-control" readonly>${board.hashtag}</textarea>
							</div>
							<button type="submit" class="btn button">목록</button>
						</div>

					</div>
				</c:forEach>
			</form>

		</div>
		</span>
		<!-- footer -->
		<footer class="container">
		<hr>
		<p class="float-right">
			<a href="#">Back to top</a>
		</p>
		<p>
			© 2017-2019 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a>
		</p>
		</footer>
	</div>
</body>
</html>