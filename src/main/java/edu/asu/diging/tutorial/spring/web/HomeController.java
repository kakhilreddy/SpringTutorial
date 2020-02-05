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
	public String home( ModelMap map) {
		Mood mood = moodService.getCurrentMood();
		map.addAttribute("mood", mood);
	
	    return "home";
	}
	
	
}
