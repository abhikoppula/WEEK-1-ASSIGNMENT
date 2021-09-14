package com.observer.beans;

public class Subscriber implements Observer {
	
    private String name;
    
    private Subject movies = new Movies();
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subscriber(String sname) {
		this.name = sname;
	}
    
    @Override
	public void updateSubscriber(String movieName,String sname) {
    	
    	System.out.println("Hi "+sname+" ,Upcoming Movie in this week "+ movieName);
    }

	@Override
	public String toString() {
		return "Subscriber [name=" + name + ", movies=" + movies + "]";
	}



	
	

}
