package com.hew.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hew.board.domain.BoardVO;


public interface BoardService {

	public void regist(BoardVO board)throws Exception;
	
	public BoardVO read(Integer eno)throws Exception;
	
	public void modify(BoardVO board)throws Exception;
	
	public void remove(Integer eno)throws Exception;
	
	public List<BoardVO> listAll()throws Exception;
	
	public List<BoardVO> listSearch(String searchType,String keyword)throws Exception;

}

