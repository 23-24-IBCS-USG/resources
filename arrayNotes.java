import java.util.*;


class arrayNotes {

	public static void main(String[] args) {
		
		// Arrays require a data type, and all data within
		// the array must be of that specific type
		String[] subjects = {"math", "english", "gloPo", "bio"};
		// We can't print the content of the array without accessing
		// them first
		System.out.println(subjects);

		// access elements individually with their position
		System.out.println(subjects[0]);
		System.out.println(subjects[3]);

		// loop through the array in order to print the content
		for (int i = 0; i < subjects.length; i++) {
			if (i == 0) {
				System.out.print("[");
			}

			System.out.print(subjects[i]);

			if (i < subjects.length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println("]");
			}
		}

		// create an array with undetermined data

		// example of creating an array with the first 10
		// powers of 2

		int[] powers = new int[10];

		int start = 1;
		for (int i = 0; i < 10; i++) {
			powers[i] = start;
			start = start * 2;
		}

		for (int i = 0; i < powers.length; i++) {
			if (i == 0) {
				System.out.print("[");
			}
			System.out.print(powers[i]);

			if (i < powers.length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println("]");
			}
		}
	}
}