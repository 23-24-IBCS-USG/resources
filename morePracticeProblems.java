class morePracticeProblems {

	public static int[] myMethod(int[] a) {


		int L = a.length;
		int res1 = 0;
		int res2 = 0;

		// we need an iterator to start a loop

		for (int i = 0; i < L; i++) {

			// access elements in arrays 
			// array name[position]
			int val = a[i];

			// even value of i (position)
			if (i % 2 == 0) {
				res1 = res1 + val;
			}

			else {
				res2 = res2 + val;
			}
		}

		res2 = res2 / 4;

		int[] result = {res1, res2};

		return result;
	}


	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 4, 5, 6, 7, 9};
		int[] result = myMethod(testArray);

		for (int i = 0; i < 2; i++) {
			System.out.println(result[i]);
		}
	}
}