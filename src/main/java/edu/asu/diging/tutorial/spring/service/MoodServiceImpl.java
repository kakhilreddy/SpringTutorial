package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodServiceImpl implements MoodService {
	
	
	Random rand;
	HashMap<Mood,Mood> moodList;
	
	@PostConstruct
	public void init() {
		moodList = new HashMap<>();
		moodList.put(new Mood("happy"), new Mood("i ate chicken"));
		
		moodList.put(new Mood("sad"), new Mood("didn't catch any mice today"));
		moodList.put(new Mood("excited"), new Mood("Holidays!!"));
		rand = new Random();
	}
	public Mood getCurrentMood() {
		
		List<Mood> moods = new ArrayList<>(moodList.keySet());
        
		return moods.get(rand.nextInt(moodList.size()));
	}
	@Override
	public Mood getMoodReason(Mood mood) {
		// TODO Auto-generated method stub
		return moodList.get(mood);
		
	}

}
