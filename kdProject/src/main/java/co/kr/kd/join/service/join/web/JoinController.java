package co.kr.kd.join.service.join.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.kd.join.service.JoinService;
import co.kr.kd.join.vo.JoinVO;

@Controller
public class JoinController {
	
	@Autowired
	JoinService joinservice;
	
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpServletRequest request) {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pw=request.getParameter("pw");
		
		JoinVO joinVO= new JoinVO();
		joinVO.setId(id);
		joinVO.setName(name);
		joinVO.setPw(pw);
		
		joinservice.insertMember(joinVO);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("test", "TEST." );
		model.addAttribute("joinVO", joinVO );
		
		
		
		return "join";
	}
}
