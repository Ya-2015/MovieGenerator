package movieTitles;
import movieTitles.MovieMakerClass;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;


public class MovieGenerator
{
	public static void main(String[] args) throws Exception
	{

		MovieMakerClass movieMaker = new MovieMakerClass();
		movieMaker.movie();
		
		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + movieMaker.getSizeAdjective() + " adjectives ");
		System.out.println("and " + movieMaker.getSizeNoun() + " nouns (" + movieMaker.getSizeAdjective()*movieMaker.getSizeNoun() + " combinations).");

		

		System.out.println( "Your movie title is: " + movieMaker.getAdjective() + " " + movieMaker.getNoun() );
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	


}