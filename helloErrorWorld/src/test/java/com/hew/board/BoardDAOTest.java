package com.hew.board;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hew.board.domain.BoardVO;
import com.hew.board.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setError_code("새로운 글을 넣습니다.");
		board.setSolution("새로운 글을 넣습니다.");
		board.setEtc("새로운 글을 넣습니다.");
		board.setHashtag("새로운 글을 넣습니다.");
		dao.create(board);
	}
	
//	@Test
//	public void testRead() throws Exception {
//		logger.info(dao.read(1).toString());
//	}

}
