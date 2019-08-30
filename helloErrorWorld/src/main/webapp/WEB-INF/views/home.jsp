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

.show>.dropdown-toggle {
   color: #fff;
   background-color: #92C350;
   border-color: #92C350;
}

.bg-dark {
   background-color: #b8d696 !important;
}
</style>

<title>Hew_main</title>

</head>

<body>
   <div class="bg-light">
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
               error Report</a> <a class="p-2 text-muted" href="#">QnA</a>
         </div>
         <!-- MenuBar(NavBar) 끝 -->
         <br>
         <!-- main -->
         <main role="main">
         <div
            class="jumbotron p-4 p-md-5 text-white rounded bg-dark text-center">
            <div class="container">
               <h1 class="display-3 font-italic">Hello, Error World</h1>
               <p>
                  Hello Error World에 오신것을 환영합니다.<br> Hello Error World는 여러분들의
                  에러를 효과적으로 관리할 수 있도록 도와줍니다.<br> 뿐만 아니라 에러에 관한 질문을 하고 답변을 얻을 수
                  있습니다.
               </p>
            </div>
         </div>
         </main>
         <br>
         <!--content start-->
         <div class="container">
            <div class="row text-center">
               <div class="col col-md-6 mx-auto">

                  <svg> <circle cx="150" cy="70" r="60" fill="none"
                     stroke="#b8d696" stroke-width="14" /> </svg>

                  <!-- <svg class="bd-placeholder-img rounded-circle" width="140"
                     height="140" xmlns="http://www.w3.org/2000/svg"
                     preserveAspectRatio="xMidYMid slice" focusable="false" role="img"
                     aria-label="Placeholder: 140x140"> -->
                  <!-- <title>Placeholder</title>
                  <rect width="100%" height="100%" fill="#b8d696"></rect> </svg> -->
                  <h2>My Error Report</h2>
                  <p>
                     발생한 에러 내용을 저장하세요.<br> 앞으로 발생할 에러를 효율적으로 관리할 수 있도록 도와줍니다.
                  </p>
                  <p>
                     <a class="btn button" href="/hew/error_report/write"
                        role="button">에러 기록하기 »</a>
                  </p>
               </div>
               <div class="col col-md-6">
               
               <svg> <circle cx="150" cy="70" r="60" fill="none"
                     stroke="#b8d696" stroke-width="14" /> </svg>
                     
                  <!-- <svg class="bd-placeholder-img rounded-circle" width="140"
                     height="140" xmlns="http://www.w3.org/2000/svg"
                     preserveAspectRatio="xMidYMid slice" focusable="false" role="img"
                     aria-label="Placeholder: 140x140">
                  <title>Placeholder</title>
                  <rect width="100%" height="100%" fill="#b8d696"></rect> </svg> -->
                  <h2>QnA</h2>
                  <p>
                     해결하지 못한 에러를 질문하세요.<br> 여러 사람들의 경험을 듣고 에러를 해결 할 수 있습니다.
                  </p>
                  <p>
                     <a class="btn button" href="#" role="button">에러 질문하기 »</a>
                  </p>
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
   </div>
</body>
</html>