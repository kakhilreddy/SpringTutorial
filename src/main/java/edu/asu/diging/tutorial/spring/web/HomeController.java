package edu.asu.diging.tutorial.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.MoodServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private MoodService moodService;
	
	@RequestMapping(value = "/")
	public String home( HttpServletRequest request) {
		Mood mood = moodService.getCurrentMood();
		
		
		request.getSession().setAttribute("mood", mood);
	
	    return "index2";
	}
	
	@RequestMapping(value = "/moodReason")
	public String moodReason(HttpServletRequest request) {
		
		Mood mood = (Mood) request.getSession().getAttribute("mood");
		
		
		request.getSession().setAttribute("feeling", moodService.getMoodReason(mood));
		
		
		return "index3";
	}
}
