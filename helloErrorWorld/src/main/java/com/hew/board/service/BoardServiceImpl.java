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
	public List<BoardVO> listAll(String searchType,String searchWord) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nboardservideimpl 시작");
		System.out.println("\n1111111111111111"+searchType+",2222222222222222222222"+searchWord);
		System.out.println("boardservideimpl 끝");
		return dao.listAll(searchType, searchWord);
		
	}



}
