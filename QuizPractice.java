import java.util.*;

class QuizPractice {

	public static boolean Quadrilateral(int a, int b, int c, int d) {
		int total = a + b + c + d;
		if (total == 360) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isRegular(ArrayList<Integer> angles) {
		int total = (angles.size() - 2)*180;

		int checkTotal = 0;

		for (int i = 0; i < angles.size(); i++) {
			checkTotal = checkTotal + angles.get(i);
		}

		if (total == checkTotal) {
			// It is a polygon!
			// check to see if it is regular
			int intAngle = total / angles.size();

			for (int i = 0; i < angles.size(); i++) {
				if (intAngle != angles.get(i)) {
					return false;
				}
			}
			// all interior angles were equal to the correct amount --> regular
			return true;
		}
		// not a polygon!
		else {
			return false;
		}
	}



	public static void main(String[] args) {
		//boolean answer = Quadrilateral(100, 100, 80, 80);

		//System.out.println(Quadrilateral(100, 100, 80, 80));

		ArrayList<Integer> angles = new ArrayList<Integer>();
		angles.add(120);
		angles.add(120);
		angles.add(120);
		angles.add(120);
		angles.add(120);
		angles.add(120);

		System.out.println(isRegular(angles));

		if (isRegular(angles)) {
			if (angles.size() == 6) {
				System.out.println("Regular Hexagon!");
			}
		}



	}



}