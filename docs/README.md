MOVIE TRACKING APPLICATION
// make a movie tracker
// using TMDb to associate the movie entered into the app with the actual data associated with it
User: towny3
Pwd----
Email: nichtown03@gmail.com

// data includes:
     - actors
     - editors
     - directors
     - tags
     - genre

// allows me to keep track of a running list of movies "to watch", "enjoyed", "disliked",...

// guesses, based on the movies that are in "enjoyed" and "disliked"
	// each genre, actor,... {PIECE OF DATA IN TMDb} will calculate the number of liked and disliked movies associated with each piece of data.
	// using this it will heuristically guess which movie I may then appreciate due to the positive association between "enjoyed" movies, the piece of data and the potential movie selection. 
	// to enhance the ability of the machine to correctly predict a movie the user will enjoy, we shall allow it to select a number of movies (>5).






public class MovieData {
	String title;
	int releaseYear;
	float ratings; // average rating
	List<String> genres;
	List<String> actors;
	Map<String, String> crew; // {CREW_NAME, CREW_ROLE}
}