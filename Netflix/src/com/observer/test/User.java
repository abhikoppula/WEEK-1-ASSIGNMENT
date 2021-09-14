package com.observer.test;

import com.observer.beans.Movies;
import com.observer.beans.Subscriber;

public class User {
	
	
	public static void main(String[] args) {
		 
		Movies movies = new Movies();
		
		Subscriber s1 = new Subscriber("Arun");
		Subscriber s2 = new Subscriber("Ajay");
		Subscriber s3 = new Subscriber("Balu");
		Subscriber s4 = new Subscriber("Priya");
		Subscriber s5 = new Subscriber("Sonu");
		
		movies.registerNetflix(s1);
		movies.registerNetflix(s2);
		movies.registerNetflix(s3);
		movies.registerNetflix(s4);
		movies.registerNetflix(s5);
		
		movies.uploadMovies("Inglorious Bastards!");
		
		movies.notifyUpcomingMovies();
		
		movies.unRegisterNetflix(s5);
		
		movies.showAllSubscribers();
	}

}
