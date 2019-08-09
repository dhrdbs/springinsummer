package kr.ac.skuniv.todo.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.fw.Action;
import kr.ac.skuniv.todo.dto.Todo;
import kr.ac.skuniv.todo.service.TodoService;
import kr.ac.skuniv.todo.service.TodoServiceImpl;

public class TodoViewAction extends Action {
	TodoService todoService = new TodoServiceImpl();
	   
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Todo> todoList = todoService.viewTodoList();
		request.setAttribute("todoList", todoList);
		RequestDispatcher rd = request.getRequestDispatcher("todo.jsp");
		rd.forward(request, response);

	}

}
