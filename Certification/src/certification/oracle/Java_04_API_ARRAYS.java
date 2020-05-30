package certification.oracle;

import java.time.LocalDate;
import java.time.Month;

// public class Java_04_API_ARRAYS {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// String morning1 = "Morning";
// System.out.println("Morning" == morning1);
// String morning2 = new String("Morning");
// System.out.println("Morning" == morning2);
// }
//
// }
// ==============
// public class Java_04_API_ARRAYS {
// //
// public static void main(String[] args) {
// String girl = new String("Shreya");
// char[] name = new char[] { 'P', 'a', 'u', 'l' };
// String boy = new String(name);
// System.out.println(boy);
//
// StringBuilder sd1 = new StringBuilder("String Builder");
// String str5 = new String(sd1);
// StringBuffer sb2 = new StringBuffer("String Buffer");
// String str6 = new String(sb2);
// String empName = null;
// String summer = new String("Summer");
// String summer2 = "Summer";
// System.out.println("Summer");
// System.out.println("autumn");
// System.out.println("autumn" == "summer");
// String autumn = new String("Summer");
// String letters = "ABCAB";
// System.out.println(letters.substring(0, 2).startsWith('A'));

// String lang1 = "Java";
// String lang2 = "JaScala";
// String returnValue1 = lang1.substring(0, 1);
// String returnValue2 = lang2.substring(0, 1);
// System.out.println(returnValue1 == returnValue2);
// System.out.println(returnValue1.equals(returnValue2));// these values are
// created using the new operator, they
// // aren’t placed in the String pool.

// }
// }

// ============
// class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// StringBuilder sb1 = new StringBuilder();
// sb1.append(true);
// sb1.append(10);
// sb1.append('a');
// sb1.append(20.99);
// sb1.append("Hi");
// System.out.println(sb1);
//
// StringBuilder sb2 = new StringBuilder();
// char[] name = { 'J', 'a', 'v', 'a', '8' };
// sb2.append(name, 1, 3);
//
// System.out.println(sb2);
//
// }
// }
// =============
// class Person {
// String name;
//
// Person(String str) {
// name = str;
// }
//
// }
//
// class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// StringBuilder sb1 = new StringBuilder();
// sb1.append("Java");
// sb1.append(new Person("Oracle"));
// System.out.println(sb1);
// }
// }
// ===============
// class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// StringBuilder sb1 = new StringBuilder("Bon");
// sb1.insert(2, 'r');// Inserts r at position 2
//
// System.out.println(sb1);
// StringBuilder sb2 = new StringBuilder("123");
// char[] name = { 'J', 'a', 'v', 'a' };
// sb2.insert(1, name, 1, 3);
// System.out.println(sb2);
// } // Prints Born
// }
// ============

// interface MyInterface {
// }
//
// class MyClass1 implements MyInterface {
// }
//
// class MyClass2 implements MyInterface {
// }
//
// class Test {
// MyInterface[] interfaceArray = new MyInterface[] { new MyClass1(), null, new
// MyClass2() };
// }
// ===================

// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<String> list = new ArrayList<>();
//
// list.add("one");
// list.add("two");
// list.add("four");
// list.add(2, "three");
// for (String element : list) {
// System.out.println(element);
// }
//
// ListIterator<String> iterator = list.listIterator();
// while (iterator.hasNext()) {
//
// System.out.println(iterator.next());
// }
//
// }
// }
// ================
// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<String> myArrList = new ArrayList<String>();
// myArrList.add("One");
// myArrList.add("Two");
//
// myArrList.add("Three");
// myArrList.set(1, "One and Half");
// for (String element : myArrList)
// System.out.println(element);
// }
// }
// =============
// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
// myArrList.add(new StringBuilder("One"));
// myArrList.add(new StringBuilder("Two"));
// myArrList.add(new StringBuilder("Three"));
//
// for (StringBuilder element : myArrList)
// element.append(element.length());
// for (StringBuilder element : myArrList)
// System.out.println(element);
// }
// }
// ================
// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<StringBuilder> myArrList = new ArrayList<>();
// StringBuilder sb1 = new StringBuilder("One");
// StringBuilder sb2 = new StringBuilder("Two");
// StringBuilder sb3 = new StringBuilder("Three");
// StringBuilder sb4 = new StringBuilder("Four");
// myArrList.add(sb1);
// myArrList.add(sb2);
//
// myArrList.add(sb3);
// myArrList.add(sb4);
// myArrList.remove(1);
// for (StringBuilder element : myArrList)
// System.out.println(element);
// myArrList.remove(sb3);
// myArrList.remove(new StringBuilder("Four"));
// System.out.println();
// for (StringBuilder element : myArrList)
// System.out.println(element);
// }
// }
//
// =============
// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<String> myArrList = new ArrayList<String>();
// String one = "One";
// String two = new String("Two");
// myArrList.add(one);
// myArrList.add(two);
// ArrayList<String> yourArrList = myArrList;
// String s2 = one.replace("O", "B");
// System.out.print(s2);
// for (String val : myArrList)
// System.out.print(val + ":");
// for (String val : yourArrList)
// System.out.print(val + ":");
// }
// }
// =============
// public class Java_04_API_ARRAYS {
// public static void main(String args[]) {
// ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
// StringBuilder sb1 = new StringBuilder("Jan");
// StringBuilder sb2 = new StringBuilder("Feb");
// myArrList.add(sb1);
// myArrList.add(sb2);
// myArrList.add(sb2);
// System.out.println(myArrList.contains(new StringBuilder("Jan")));
// System.out.println(myArrList.contains(sb1));
// System.out.println(myArrList.indexOf(new StringBuilder("Feb")));
// System.out.println(myArrList.indexOf(sb2));
// System.out.println(myArrList.lastIndexOf(new StringBuilder("Feb")));
// System.out.println(myArrList.lastIndexOf(sb2));
//
// }
// }
//===============
//public class Java_04_API_ARRAYS {
//	public static void main(String args[]) {
//		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
//		StringBuilder sb1 = new StringBuilder("Jan");
//		StringBuilder sb2 = new StringBuilder("Feb");
//		myArrList.add(sb1);
//		myArrList.add(sb2);
//		myArrList.add(sb2);
//		ArrayList<StringBuilder> assignedArrList = myArrList;
//		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();
//		System.out.println(myArrList == assignedArrList);
//		System.out.println(myArrList == clonedArrList);
//		StringBuilder myArrVal = myArrList.get(0);
//		StringBuilder assignedArrVal = assignedArrList.get(0);
//		StringBuilder clonedArrVal = clonedArrList.get(0);
//		System.out.println(myArrVal == assignedArrVal);
//		System.out.println(myArrVal == clonedArrVal);
//
//	}
//}
//==============
public class Java_04_API_ARRAYS {
	public static void main(String args[]) {
		LocalDate date1 = LocalDate.of(2015, 12, 27);
		LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);
		LocalDate date3 = LocalDate.now();
		LocalDate date4 = LocalDate.parse("2025-08-09");
		LocalDate date = LocalDate.parse("2020-08-30");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
	}
}