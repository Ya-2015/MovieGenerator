package movieTitles;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;


public class MovieMakerClass {
	
	private int sizeAdjective;
	private int sizeNoun;
	private String adjective;
	private String noun;
	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}
	
	public void movie(){
Random r = new Random();

		
		String[] adjectives;
		try {
			adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
			sizeAdjective = adjectives.length;
			adjective = (adjectives[r.nextInt(sizeAdjective)]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] nouns;
		try {
			nouns = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
			sizeNoun = nouns.length;
			noun = (nouns[r.nextInt(sizeNoun)]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public int getSizeAdjective() {
		return sizeAdjective;
	}

	

	public int getSizeNoun() {
		return sizeNoun;
	}

	public void adjectiveGenerator(){
		
		Random r = new Random();
		
		
	}

	public String getAdjective() {
		return adjective;
	}

	

	public String getNoun() {
		return noun;
	}

	
}
