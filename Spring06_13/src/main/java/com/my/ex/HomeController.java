package com.my.ex;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("/board/view")
	public String view() {
		return "board/view";
	}
	@RequestMapping("/board/content")
	public String view2(Model model) {
		model.addAttribute("id",30);
		return "board/content";
	}
	@RequestMapping("board/reply")
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		return mv;//mv.jsp를 말하는거 아님
	}
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("greeting",getGreeting());
		mv.setViewName("hello/hello");
		return mv;
	}
	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour>=6&&hour<=10) {
			return "좋은 아침입니다.";
		}else if(hour>=12 && hour<=15) {
			return "점심식사는 하셨죠?";
		}else if(hour>=18 && hour<=22) {
			return "좋은 저녁 시간 되세요";
		}
		return "좋은 하루입니다";
	}
	
	
	/*
	@RequestMapping("article/newArticle.do")
	public class NewArtivleController{
		
		public String form() {
			return "article/newArticleForm";
		}
	}
	*/
	
}
