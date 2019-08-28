package com.hew.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hew.board.domain.BoardVO;

import com.hew.board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer eno) throws Exception {
		return dao.read(eno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer eno) throws Exception {
		dao.delete(eno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {

		List<BoardVO> list = null;
		list = dao.listAll();
		return list;
	}

	@Override
	public List<BoardVO> listSearch(String searchType,String keyword) throws Exception {
		// TODO Auto-generated method stub
		List<BoardVO> list = null;
		list = dao.listSearch(searchType,keyword);
		return list;
		
	}



}
