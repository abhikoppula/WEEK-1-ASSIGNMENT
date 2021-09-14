package com.observer.beans;

public interface Subject {

	void registerNetflix(Subscriber subscribers);

	void unRegisterNetflix(Subscriber subscriber);

	void notifyUpcomingMovies();

	void uploadMovies(String movieNname);

	void showAllSubscribers();

}