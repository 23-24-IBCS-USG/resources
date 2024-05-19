import java.util.*;

class practiceWS {

	static Scanner s = new Scanner(System.in);


	// create a method for each problem
	// 1. slope

	public static float slope(int[] coords) {

		float slope = 0;

		// element at the first position is x1
		int x1 = coords[0];

		// element at the second position is y1
		int y1 = coords[1];

		// element at the third position is x2
		int x2 = coords[2];

		// element at the fourth position is y2
		int y2 = coords[3];

		slope = (y2 - y1) / (x2 - x1);

		return slope;

	}

	public static boolean checkSlope(int[] coords) {

		boolean sameSlope = false;

		// element at the first position is x1
		int x1 = coords[0];

		// element at the second position is y1
		int y1 = coords[1];

		// element at the third position is x2
		int x2 = coords[2];

		// element at the fourth position is y2
		int y2 = coords[3];

		// element at the third position is x2
		int x3 = coords[4];

		// element at the fourth position is y2
		int y3 = coords[5];

		float slope1 = (y2 - y1) / (x2 - x1);
		float slope2 = (y3 - y1) / (x3 - x1);

		if (slope1 == slope2) {
			sameSlope = true;
		}

		return sameSlope;

	}

	public static float avgWordLength() {
		System.out.println("Please type a sentence");
		String sen = s.nextLine();
		int l = sen.length();

		// keep track of total amount of characters
		// We will calculate the number of words and then divide.
		int totalChars = 0;
		int numW = 1;

		for (int i = 0; i < l; i++) {
			if (sen.charAt(i) == ' ') {
				numW = numW + 1;
			}
			// do not count spaces as characters for word length
			else {
				totalChars = totalChars + 1;
			}
		}

		System.out.println(totalChars);
		System.out.println(numW);

		// the "(float)" before doing division is called 'casting' in java
		// this is only necessary in cases where we divide an (int) / (int)
		// By default, java will complete integer division and the result will
		// be an integer. If we want a float, we need to cast the float to the
		// numerator or denominator first.

		// without casting, we would still get an answer, but it may not be
		// as precise and would ignore any decimals.
		float avgWL = (float) totalChars / numW;
		return avgWL;
	}

	public static boolean isPalindrome(String st) {
	
		String reverse = "";

		// use a loop to create the reverse of the string
		for (int i = 0; i < st.length(); i++) {
			// substring method can access individual characters
			// then concatenate to build the reverse
			// charAt() would work, but it is better to have these
			// individual characters as a string data type
			reverse = st.substring(i, i+1) + reverse; 
		}

		//.equals() method checks if two strings are equivalent
		if (reverse.equals(st)) {
			return true;
		}
		else {
			return false;
		}

		// Different method commented below

		/*
		boolean pal = false;

		for (int i = 0; i < s.length(); i++) {

			// Check if first character equals last character
			// then repeat for second character and second to last...

			if (s.charAt(i) == s.charAt(s.length() -1 - i)) {
				pal = true;
			}
			else {
				pal = false;
				return pal;
			}
		}
		return pal;
		*/

	}

	public static ArrayList<String> storyCreator() {
		System.out.println("Are you ready to start your story?\nBegin typing...");
		ArrayList<String> story = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			// get user input 10 times
			String newS = s.nextLine();
			story.add(newS);
		}

		// strings have contains() method to check if the substring exists
		// in it. You could also use loop and substrings to check, but that
		// is just more code...
		if (story.get(0).contains("the")) {
			if (story.get(9).contains("end")) {
				// only return the whole story if it fits the criteria
				return story;
			}
		}

		// if it doesn't fit the criteria, return an empty arraylist
		ArrayList<String> emptyStory = new ArrayList<String>();
		return emptyStory;
	}



	public static int numWords() {
		System.out.println("Please type a sentence");
		String sen = s.nextLine();
		int l = sen.length();
		int numW = 1;

		for (int i = 0; i < l; i++) {
			if (sen.charAt(i) == ' ') {
				numW = numW + 1;
			}
		}
		return numW;
	}






	public static void main(String[] args) {
		//int[] a = {6, 6, 5, 5, 50, 50};
		//boolean line = checkSlope(a);

		//System.out.println(line);


		/*int[] a = {0, 0, 5, 5};
		float s = slope(a);

		System.out.println("Your slope is " + s);*/

		//int n = numWords();
		//System.out.println(n + " words in the sentence!");

		//System.out.println(isPalindrome("racecar"));

		//float f = avgWordLength();
		//System.out.println("Your average word length is " + f + " characters.");
		
		ArrayList<String> stor = storyCreator();
		if (stor.size() > 1) {
			System.out.println("Wow, what a nice story!");
		}
		else {
			System.out.println("You did not start your story with 'the' or finish with 'end'");
		}

	}
}