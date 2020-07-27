package co.kr.kd.join.service.board.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.kd.join.service.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpServletRequest request) {
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		
		
		boardService.insertBoard(title,content);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("test", "TEST." );
		model.addAttribute("title", title );
		model.addAttribute("content", content );
		
		
		
		
		return "board";
	}
	
}
