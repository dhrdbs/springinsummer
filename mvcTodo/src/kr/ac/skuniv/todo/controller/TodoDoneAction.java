package kr.ac.skuniv.todo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.fw.Action;
import kr.ac.skuniv.todo.dto.Todo;
import kr.ac.skuniv.todo.service.TodoService;
import kr.ac.skuniv.todo.service.TodoServiceImpl;

public class TodoDoneAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		TodoService service = new TodoServiceImpl();
//		service.todoDone(Integer.parseInt(request.getParameter("id")));
//		response.sendRedirect("todoview.sku");
		
TodoService service = new TodoServiceImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Todo todo = service.getTodo(id);
		if(todo.isDone()) {
			service.deleteTodo(id);
		}else {
			service.todoDone(id);
		}	
		
		response.sendRedirect("todoview.sku");
	}

}
