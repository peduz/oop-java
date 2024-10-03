package it.lessons.oop.inheritance;

public class Main {

	public static void main(String[] args) {
		Serie friends = new Serie("Friends", 80);
		
//		friends.riproduci();
		
		SerieComedy comedy = new SerieComedy(friends, true);
		
		comedy.riproduci();
		
		System.out.println(comedy);
		
		Movie film = new Movie("Profondo rosso");
		film.setDurata(128);
		
		System.out.println(film);
	}
}
