package edu.asu.diging.tutorial.spring.domain;

import java.util.HashMap;
import java.util.HashSet;

public class MoodUtil {

	private static HashMap<String,Mood> moods = new HashMap<String, Mood>();
	
	public static Mood getMood(String mood) {
		
		if (moods.get(mood) == null) {
			moods.put(mood, new Mood(mood));
		}
		
		return moods.get(mood);
	}
	
}
