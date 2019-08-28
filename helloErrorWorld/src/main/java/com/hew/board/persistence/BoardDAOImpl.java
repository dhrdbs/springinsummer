package com.hew.board.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hew.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.hew.board.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public BoardVO read(Integer eno) throws Exception {
		return session.selectOne(namespace + ".read", eno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(Integer eno) throws Exception {
		session.delete(namespace + ".delete", eno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
		
	}

	@Override
	public List<BoardVO> listSearch(String searchType,String keyword) throws Exception {
		// TODO Auto-generated method stub
		
		Map<String,String>map=new HashMap<String, String>();
		map.put("searchType",searchType);
		map.put("keyword",keyword);
		return session.selectList(namespace + ".listAll", map);
	}

	

}
