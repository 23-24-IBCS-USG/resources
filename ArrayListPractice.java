import java.util.*;

class ArrayListPractice {

	public static void main(String[] args) {
		
		// create an arraylist. It starts as an empty list

		ArrayList<String> cats = new ArrayList<String>();

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(250);

		// Arrays have .length   ArrayLists have .size()
		System.out.println(cats.size());

		// add some cats

		cats.add("Daisy");
		cats.add("Leo");

		// get an element at a position
		// arrays use cats[0]   ArrayList use cats.get(0)

		System.out.println(cats.get(0));

		System.out.println(cats.size());

		cats.remove("Leo");

		System.out.println(cats.size());

	}

}