package com.hew.board.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hew.board.domain.BoardVO;
import com.hew.board.service.BoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hew/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "home";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writeGET(BoardVO board, Model model) throws Exception {
		logger.info("write get .........");

		return "/hew/error_report/error_insert";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePOST(BoardVO board, Model model) throws Exception {
		logger.info("register post............");
		logger.info(board.toString());

		System.out.println(board.getError_code() + "1111111111111111111111111111");
		System.out.println(board.toString());
		service.regist(board);

		model.addAttribute("result", "success");
		return "redirect:/hew/error_report/listAll";

	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String viewGET(HttpServletRequest request, Model model) throws Exception {
		int eno= Integer.parseInt(request.getParameter("eno"));
		BoardVO board=service.read(eno);
		model.addAttribute("board", board);
		return "/hew/error_report/error_view";
	}
	
	@RequestMapping(value = "/error_report/listCri", method = RequestMethod.GET) // http://localhost:8080/hew/error_report/listCri
	public String listCri(Model model) throws Exception {
		// logger.info("show all listAll get............");
		List<BoardVO> list = service.listAll();
		model.addAttribute("list", list);

		return "/hew/error_report/listCri";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) throws Exception {
		logger.info("Register get............");

		return "/hew/member/register";

	}

	
	  @RequestMapping(value = "/error_report/listAll", method = RequestMethod.GET)
	  // http://localhost:8080/hew/error_report/listAll 
	  public String listAll(Model model) throws Exception { // logger.info("show all listAll get............");
	  List<BoardVO> list = service.listAll();
	  model.addAttribute("list", list);
	  
	  return "/hew/error_report/listAll"; 
	  }
	/*
	 * @RequestMapping(value = "/error_report/listAll", method = RequestMethod.GET)
	 * // http://localhost:8080/hew/error_report/listAll public String
	 * listAll(HttpServletRequest request,Model model) throws Exception { //
	 * logger.info("show all listAll get............"); String
	 * keyword=request.getParameter("keyword"); String
	 * searchType=request.getParameter("searchType");
	 * 
	 * List<BoardVO> list = service.listSearch(searchType, keyword);
	 * model.addAttribute("list", list);
	 * 
	 * return "/hew/error_report/listAll"; }
	 */

//	@RequestMapping(method = RequestMethod.GET, value = "/error_report/listAll/listSearch")
//	public String listSearch(HttpServletRequest request,Model model) throws Exception {
//
//		// logger.info("show all listAll get............");
//
//		String keyword=request.getParameter("keyword");
//		String searchType=request.getParameter("col");
//		System.out.println(searchType);
//		if(searchType=="none") {
//			searchType=null;
//		}
//		List<BoardVO> list = service.listSearch(searchType, keyword);
//		model.addAttribute("list", list);
//
//		return "/hew/error_report/listAll";
//	}

}
