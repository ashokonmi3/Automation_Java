package certification.oracle;

//public class MainFunction {
//
//	public static void main(String args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World1 ");
//	}
//
//	public static void main(int a) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World1 ");
//	}
//
//}
// =================
// Command line parameter

// public class MainFunction {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// System.out.println("Hello World");
// }
// }

/* to run java MainFunction */

// public class MainFunction {
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// System.out.println(args[0]);
// System.out.println(args[1]);
//
// }
// }

//public class MainFunction {
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World1 ");
////	boolean b=0;
//
//	byte a=10;
//	byte b=20;
////	short i =a+b;
//	int i =a+b;
//	
//			
//	
//	}
//
//
//}

import java.util.ArrayList;

class MyPerson {

	String name;

	MyPerson(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyPerson) {
			MyPerson p = (MyPerson) obj;
			boolean isEqual = p.name.equals(this.name);
			return isEqual;

		}

		else
			return false;
	}
}
// Compare name
// of method
// parameter to
// that of this object’
// s name

public class MainFunction {
	public static void main(String args[]) {
		ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
		MyPerson p1 = new MyPerson("Shreya");
		MyPerson p2 = new MyPerson("Paul");
		MyPerson p3 = new MyPerson("Harry");
		myArrList.add(p1);
		myArrList.add(p2);

		myArrList.add(p3);
		myArrList.remove(new MyPerson("Paul"));
		for (MyPerson element : myArrList)
			System.out.println(element.name);
	}
}
