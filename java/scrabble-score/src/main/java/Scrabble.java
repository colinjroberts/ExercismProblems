import java.util.Map;
import java.util.HashMap;

class Scrabble {
	private Map<Character, Integer> tilePoints = new HashMap<Character, Integer>();
	private int wordPoints;
	private String word;

	public Scrabble(String input) {
		char[] letters =  {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T', 'D', 'G', 'B', 'C', 'M', 'P', 'F', 'H', 'V', 'W', 'Y', 'K', 'J', 'X', 'Q', 'Z'};
		int[] points = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10};	
		for (int i = 0; i<26; i++){
			tilePoints.put(letters[i], points[i]);
		}

		word = input.toUpperCase();
		wordPoints = 0;
	}

	public int getScore() {		
		for (int i=0; i<word.length(); i++){
			wordPoints += tilePoints.get(word.charAt(i));
		}

		return wordPoints;	
	}



}
