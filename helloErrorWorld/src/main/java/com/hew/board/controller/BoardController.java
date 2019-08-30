package com.hew.board.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		logger.info("환영해", locale);

		return "home";
	}

	@RequestMapping(value = "/error_report/write", method = RequestMethod.GET)
	public String writeGET(BoardVO board, Model model) throws Exception {
		logger.info("write get .........");

		return "/hew/error_report/error_insert";
	}
	
	@RequestMapping(value = "/error_report/write", method = RequestMethod.POST)
	public String writePOST(BoardVO board, Model model) throws Exception {
		logger.info("register post............");
		logger.info(board.toString());

		System.out.println(board.getError_code() + "1111111111111111111111111111");
		System.out.println(board.toString());
		service.regist(board);

		model.addAttribute("result", "success");
		return "redirect:/hew/error_report/listAll";

	}
	

	@RequestMapping(value = "/error_report/update", method = RequestMethod.GET)
	public String updateGET(HttpServletRequest request, Model model) throws Exception {
		int eno= Integer.parseInt(request.getParameter("eno"));
		BoardVO board=service.read(eno);
		model.addAttribute("board", board);
		return "/hew/error_report/error_update";
	}

//	@RequestMapping(value = "/error_report/view", method = RequestMethod.GET)
//	public String viewGET(HttpServletRequest request, Model model) throws Exception {
//		int eno= Integer.parseInt(request.getParameter("eno"));
//		BoardVO board=service.read(eno);
//		model.addAttribute("board", board);
//		return "/hew/error_report/error_view";
//	}
//	
	@RequestMapping(value = "/error_report/view", method = RequestMethod.GET)
	public String viewGET(HttpServletRequest request, Model model) throws Exception {
		logger.info("계시글 보장");
		int eno= Integer.parseInt(request.getParameter("eno"));
		 System.out.println("마 이게 eno:"+eno);
		BoardVO board=service.read(eno);
		
		model.addAttribute("board", board);
		logger.info("계시글 보장");
		return "/hew/error_report/error_view";
	}

	@RequestMapping(value = "/error_report/listCri", method = RequestMethod.GET) // http://localhost:8080/hew/error_report/listCri
	public String listCri(Model model) throws Exception {
		// logger.info("show all listAll get............");
		List<BoardVO> list = service.listAll();
		model.addAttribute("list", list);

		return "/hew/error_report/listCri";
	}

	@RequestMapping(value = "/member/register", method = RequestMethod.GET)
	public String register(Model model) throws Exception {
		logger.info("Register get............");

		return "/hew/member/register";

	}

	
	  @RequestMapping(value = "/error_report/listAll", method = RequestMethod.GET)
	  // http://localhost:8080/hew/error_report/listAll 
	  public  ModelAndView viewList(HttpServletRequest request,@RequestParam(defaultValue ="title")String searchType,@RequestParam(defaultValue ="")String searchWord) throws Exception { // logger.info("show all listAll get............");
		  
		  logger.info("listAll 시작............");
		  List<BoardVO>list=service.listAll(searchType, searchWord);
		  ModelAndView mav=new ModelAndView();
		  System.out.println("하나 searchType:"+searchType+",searchWord:"+searchWord+"\n");
		  //searchType=request.getParameter(searchType);
		  //searchWord=request.getParameter(searchWord);
		  Map<String ,Object> map= new HashMap<String ,Object>();
		 
		  map.put("list", list);
		  map.put("searchType",searchType);
		  map.put("searchWord",searchWord);
		  System.out.println("둘 searchType:"+searchType+",searchWord:"+searchWord+"\n");
		  System.out.println("나는야 리스트"+list);
		  System.out.println("셋  map.get(searchType):"+map.get("searchType")+",map.get(searchWord):"+map.get("searchWord"));
		  mav.addObject("map", map);
		  logger.info("listAll 끝............");
		 // System.out.println("111111111111111"+map.get(searchType)+"2222222222222222"+map.get(searchWord));
		  mav.setViewName("/hew/error_report/listAll");
	  return mav; 
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
