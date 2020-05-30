package certification.oracle;
//

//class Java_07_Exception {
//
//	public static void main(String[] args) {
//		// ArrayList<String> list;
//		int list;
//		if (list != 0)
//			System.out.println(list);
//		// list.add("1");
//	}
//}
// ==========================

//class Java_07_Exception {
//	static String[] oldLaptops;
//	// String[] oldLaptops;
//
//	public static void main(String[] args) {
//
//		System.out.println(oldLaptops[1]);
//	}
//}
// =================
//class Java_07_Exception {
//
//	public static void main(String[] args) {
//		String[] newLaptops = new String[2];
//		System.out.println(newLaptops[1].toString());
//	}
//}

// =================
class ExceptionClass {
	public static void main(String[] args) {
		String[][] oldLaptops =

				{ { "Dell", "Toshiba", "Vaio" }, null, { "IBM" }, new String[10] };
		System.out.println(oldLaptops[0][0]);
		System.out.println(oldLaptops[1]);

		System.out.println(oldLaptops[3][6]);
		System.out.println(oldLaptops[3][0].length());
		System.out.println(oldLaptops);
	}
}
// ==============
// class ExceptionClass {
// public static void main(String args[]) {
// int a = 10;
// int y = a++;
// int z = y--;
// int x1 = a - 2 * y - z;
// int x2 = a - 11;
// // int x = 0.0 / 0;
// System.out.println(0.0 / 0);
// }
// }
// =====================

// public class ExceptionClass {
// public static int convertToNum(String val) {
// int num = 0;
// try {
// num = Integer.parseInt(val, 16);
// } catch (NumberFormatException e) {
// throw new NumberFormatException(val + " cannot be converted to hexadecimal
// number");
//
// }
// return num;
// }
//
// public static void main(String args[]) {
// System.out.println(convertToNum("16b"));
// System.out.println(convertToNum("65v"));
// }
// }
// ==============

// public class ExceptionClass {
// static String name = getName();
//
// static String getName() {
// throw new MyException();
// }
// }
// ===========
//
// public class ExceptionClass {
// static String name = getName();
//
// static String getName() {
// throw new MyException();
// }
//
// public static void main(String args[]) {
// System.out.println("abc");
// // System.out.println(convertToNum("65v"));
// // }
// }
// }
//
// class MyException extends RuntimeException {
// }
// ============

// class Course {
// String courseName;
//
// Course() {
// Course c = new Course();
// c.courseName = "Oracle";
// }
// }
//
// class Java_07_Exception {
// public static void main(String args[]) {
// Course c = new Course();
// c.courseName = "Java";
// System.out.println(c.courseName);
// }
// }
