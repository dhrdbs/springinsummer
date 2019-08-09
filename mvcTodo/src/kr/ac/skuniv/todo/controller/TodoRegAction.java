package kr.ac.skuniv.todo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.fw.Action;
import kr.ac.skuniv.todo.service.TodoService;
import kr.ac.skuniv.todo.service.TodoServiceImpl;

public class TodoRegAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		TodoService service = new TodoServiceImpl();
		service.regTodo(request.getParameter("todo"));
		response.sendRedirect("todoview.sku");

	}

}
