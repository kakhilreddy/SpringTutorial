package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;

@Controller
public class ExplanationController {

	@Autowired
	MoodService moodService;
	
	@RequestMapping(value="/explanation/{mood}")
	public String showExplanation(@PathVariable("mood") String mood, Model model) {
	    model.addAttribute("mood", mood);
	    model.addAttribute("explanation", moodService.getExplanation(mood).getExplanation());
	    return "explanation";
	}
}
