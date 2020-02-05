package edu.asu.diging.tutorial.spring.domain;

public class Mood {

	 private String feeling;
	 
	    public Mood(String mood) {
	        feeling = mood;
	    }
	 
	    public String getFeeling() {
	        return feeling;
	    }
	 
	    public void setFeeling(String feeling) {
	        this.feeling = feeling;
	    }

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(this == obj)
				return true;
			System.out.print(((Mood)obj).feeling);
			return feeling.equals(((Mood)obj).getFeeling());
		}
	    
	    
}
