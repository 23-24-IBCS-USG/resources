// import the utility library
import java.util.*;

// A class which asks the user for an order (cup of coffee)
// and it prints out what the user ordered as well as a
// price and how much they owe.
class CoffeeShop {

	public static void main(String[] args) {
		
		// Get user input for a name
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome, what is your name?");
		// Strings require a data type to be instantiated
		// Strings have positions for their characters

		// nextLine() prompts the user to type in terminal
		String name = s.nextLine();

		// Concatenate strings by adding them together
		String response = "";
		response = "Hello " + name + "!";
		System.out.println(response);


		System.out.println("1. Coffee with caramel\n 2. Energy drink, etc...");

		// get an order from the user
		System.out.println("What would you like to order?");

		String order = s.nextLine();

		System.out.println("Here, your " + order + " is ready!");

		// check to see what is in the order
		for (int i = 0; i < order.length() - 2; i++) {

			String sub = order.substring(i, i+3);

			if (sub.equals("tea")) {
				System.out.println("That tea will cost you $4.00");
			}

			if (sub.equals("cof")) {
				System.out.println("That coffee will cost you $6.00");
			}

			if (sub.equals("wat")) {
				System.out.println("That water is free!");
			}

		}





	}

}