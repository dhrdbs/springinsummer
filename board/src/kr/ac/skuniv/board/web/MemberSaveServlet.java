package kr.ac.skuniv.board.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.board.dao.MemberDAO;
import kr.ac.skuniv.board.dto.Member;

@WebServlet("/memberSave")
public class MemberSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 입력받은 내용을 DB에 저장
		MemberDAO dao = new MemberDAO();
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));

		boolean resultFlag = dao.addMember(member);
		request.setAttribute("resultFlag", resultFlag);
		request.setAttribute("memberInfo", member);
		
		response.sendRedirect("memberList");
	}

}
