package certification.oracle;

//public class IfElse {
//
//	public static void main(String[] args) {
//		int score = 100;
//		String result = "";
//		String name = "Lion";
//		java.io.File file = new java.io.File("F");
//		if (name.equals("Lion"))
//			score = 200;
//		System.out.println(score);
//	}
//
//}
//===========

public class IfElse {
	//
	public static void main(String[] args) {
		// String result = "1";
		// int score = 10;
		// if ((score = score + 10) == 100)
		// result = "A";
		// else if ((score = score + 29) == 50)
		// result = "B";
		// else if ((score = score + 200) == 10)
		// result = "C";
		// else
		// result = "F";
		// System.out.println(result + ":" + score);
		// =======================

		// boolean testValue = false;
		// if (testValue == true) {
		//
		// }
		//
		// else
		// System.out.println("value is false");
		// ===============

		// String name = "Lion";
		// int score = 100;
		// if (name.equals("Lion"))
		// score = 200;
		// name = "Larry";
		// else
		// score=129;

		// String name = "Lion";
		// if (name.equals("Lion"))
		// System.out.println("Lion");
		// else
		// System.out.println("Not a Lion");
		// System.out.println("Again, not a Lion");

		// boolean allow = false;
		// if (allow = true)
		// System.out.println("value is true");
		// else
		// System.out.println("value is false");

		// ====
		// int bill = 2000;
		// int discount = (bill > 2000) ? bill - 150 : bill - 100;
		// System.out.println(discount);
		// ==========================================
		String day = new String("SUN");
		switch (day) {
		default:
			System.out.println("Invalid day?");
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			System.out.println("Time to work");
			break;
		case "FRI":
			System.out.println("Nearing weekend");
			break;
		case "SAT":
		case "SUN":
			System.out.println("Weekend!");
			break;

		}
		// =================================
		// StringBuilder myArr[] = { new StringBuilder("Java"), new
		// StringBuilder("Loop") };
		// for (StringBuilder val : myArr)
		// System.out.println(val);
		// for (StringBuilder val : myArr)
		// val = new StringBuilder("Oracle");
		// for (StringBuilder val : myArr)
		// System.out.println(val);

		// int i = 10;
		// do
		// while (i++ < 15)
		// i = i + 20;
		// while (i < 2);
		// System.out.println(i);
	}

}
