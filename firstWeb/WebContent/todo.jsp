<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<title>todoList</title>
<link rel="stylesheet" type="text/css" href="todo.css">
</head>
<body>
	<div class="todo-list-template">
		<div class="title">My To Do List</div>
		<section class="form-wrapper">
			<div class="form">
				<input type="text" id="myInput" placeholder="할일..." />
				<div class="add-button">추가</div>
			</div>
		</section>
		<section class="todos-wrapper">
			<ul id="todo-item-list">
				<li class="todo-item"><span class="todo-text">봄봄이랑 놀기</span></li>
			</ul>
		</section>
	</div>

</body>
</html>