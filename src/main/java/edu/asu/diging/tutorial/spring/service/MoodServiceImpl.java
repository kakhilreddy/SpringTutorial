package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Explanation;
import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.domain.MoodUtil;

@Service
public class MoodServiceImpl implements MoodService {
	
	
	Random rand;
	HashMap<Mood,Explanation> moodList;
	
	@PostConstruct
	public void init() {
		moodList = new HashMap<>();
		moodList.put(MoodUtil.getMood("happy"), new Explanation("i ate chicken"));
		
		moodList.put(MoodUtil.getMood("sad"), new Explanation("didn't catch any mice today"));
		moodList.put(MoodUtil.getMood("excited"), new Explanation("Holidays!!"));
		rand = new Random();
	}
	public Mood getCurrentMood() {
		
		List<Mood> moods = new ArrayList<>(moodList.keySet());
        
		return moods.get(rand.nextInt(moodList.size()));
	}
	@Override
	public Explanation getExplanation(String mood) {
		// TODO Auto-generated method stub
		
				return moodList.get(MoodUtil.getMood(mood));
				
				
		
	}


}
