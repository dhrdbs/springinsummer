package testmy.dao;

import java.util.List;

import testmy.dto.Todo;
import testmy.mapper.Mapper;

@Mapper
public interface TodoMapper {
	public Todo getTodo(int id);
    public List<Todo> getTodos();
}
