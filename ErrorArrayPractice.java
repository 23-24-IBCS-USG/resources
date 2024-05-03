class ErrorArrayPractice {

	// void means there is no return value
	// n1 and n2 are Parameters (inputs)
	public void sayNames(String n1, String n2) {
		System.out.println("Hello " + n1 + " and " + n2);
	}

	public static int checkSum(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {
		
		// E is an instance of this class, so we can call
		// the methods for it
		ErrorArrayPractice E = new ErrorArrayPractice();
		E.sayNames("Ab", "Am");

		// checkSum is a static method. it does not require
		// the instance E in order to be called
		// if we return a value. It should be printed
		// or set equal to a variable
		int result = checkSum(100, 200);
		System.out.println(checkSum(50, 42));

		String[] colors = {"blue", "yellow", "pink", "orange"};

		/*
		// out of bounds
		System.out.println(colors[4]);

		// out of bounds in a loop
		for (int i = 0; i <= colors.length; i++) {
			System.out.println(colors[i]);
		}
		*/

		int num = 4;

		String sentence = "There are " + num + colors[1] + " ties!";
		System.out.println(sentence);

		/*
		// Error adding string to integer
		int newNum = num + colors[2];
		System.out.println(newNum);
		*/

	}



}