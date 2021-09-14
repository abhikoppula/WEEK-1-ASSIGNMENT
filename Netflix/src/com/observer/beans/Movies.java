package com.observer.beans;

import java.util.ArrayList;
import java.util.List;

public class Movies implements Subject {
	
	private List<Subscriber> subList = new ArrayList<>();
	
    private String movieName;
    
    @Override
	public void registerNetflix(Subscriber subscribers) {
    	
    	subList.add(subscribers);
    }
	
    @Override
	public void unRegisterNetflix(Subscriber subscriber) {
    	System.out.println("=======Unsubscribed user =========");
    	subList.remove(subscriber);
    	System.out.println(subscriber.getName());
    }
	
    @Override
	public void notifyUpcomingMovies() {
    	for(Subscriber users: subList) {
    		users.updateSubscriber(movieName,users.getName());
    	}
    }
    
    @Override
	public void  uploadMovies(String movieNname) {
    	this.movieName=movieNname;
    }

   @Override
public void showAllSubscribers() {
    	System.out.println("=======Subscribers List=========");
		for(Subscriber users: subList) {
    		System.out.println(users.getName());
    	}
    }
	@Override
	public String toString() {
		return "Movies [subList=" + subList + ", movieName=" + movieName + "]";
	}
    
    
}
