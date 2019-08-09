package kr.ac.skuniv.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.todo.dto.Todo;
import kr.ac.skuniv.todo.service.TodoService;
import kr.ac.skuniv.todo.service.TodoServiceImpl;

@WebServlet("/todoview")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    TodoService todoService = new TodoServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Todo> todoList = todoService.viewTodoList();
		request.setAttribute("todoList", todoList);
		RequestDispatcher rd = request.getRequestDispatcher("todo.jsp");
		rd.forward(request, response);
	}

}
