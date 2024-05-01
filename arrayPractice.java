class arrayPractice {
	public static void main(String[] args) {
		
		// String array problem

		String[] names = {"Abby", "Amy", "Vera", "Lisa"};

		// (a)
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > 3) {
				System.out.println(names[i]);
			}
		}

		// (b)
		for (int i = 0; i < names.length; i++) {
			if (names[i].charAt(0) == 'A') {
				names[i] = "Student";
			}
		}
		// printing (b)
		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				System.out.print("[");
			}
			System.out.print(names[i]);
			if (i < names.length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println("]");
			}
		}

		// (c)

		String[] names2 = {"Phillips", "Davis", "Co", "Sid", "Stub"};
		// (c.a)
		for (int i = 0; i < names2.length; i++) {
			if (names2[i].length() > 3) {
				System.out.println(names2[i]);
			}
		}

		// (c.b)
		for (int i = 0; i < names2.length; i++) {
			if (names2[i].charAt(0) == 'A') {
				names2[i] = "Student";
			}
		}
		// printing (c.b)
		for (int i = 0; i < names2.length; i++) {
			if (i == 0) {
				System.out.print("[");
			}
			System.out.print(names2[i]);
			if (i < names2.length - 1) {
				System.out.print(", ");
			}
			else {
				System.out.println("]");
			}
		}

		// Integer array problem

		int[] nums = {5, 3, 10, 6, 7, 8, 1};

		// (a)
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		System.out.println(total);

		// (b)
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 6) {
				System.out.println(nums[i]);
				product = product * nums[i];
			}
		}
		System.out.println(product);

		// (c)
		int maxNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		System.out.println(maxNum);

	}
}