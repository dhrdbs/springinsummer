package com.hew.board.persistence;

import java.util.List;

import com.hew.board.domain.BoardVO;


public interface BoardDAO {
	
	public void create(BoardVO vo)throws Exception;
	
	public BoardVO read(Integer eno)throws Exception;
	
	public void update(BoardVO vo)throws Exception;
	
	public void delete(Integer eno)throws Exception;
	
	public List<BoardVO> listAll()throws Exception;
	
	public List<BoardVO> listAll(String searchType,String searchWord)throws Exception;

	
}
