
package certification.oracle;// package name should be first line always

//import certification.another.ExamQuestion;
//
//public class Java_01_Basics {
//
//	public static void main(String[] args) {
//		ExamQuestion e = new ExamQuestion();
//		ExamQuestion f;
//		e.print();
//		f.print();
//	}
//
//}

//===============
//import certification.ExamQuestion;
//package university;Java_01_Basics{ExamQuestion eq;}

// ====================
//public class Java_01_Basics {
//
//	public static void main(String[] args) {
// // TODO Auto-generated method stub
// String name = "Shre /* ya
// */ Paul"; System.out.println(name);"
// String name1 = /* Harry */ "Paul";
// System.out.println(name);
//
// }
//
//}

// ======================
class Phone {
	String model;
	String company;

	Phone(String model) {
		this.model = model;
	}

	double weight;

	void makeCall(String number) {
		// code
	}

	void receiveCall() {
		// code
	}
}

interface Controls {
	void changeChannel(int channelNumber);

	void increaseVolume();

	void decreaseVolume();
}
//
// ==============================
/*
 * When you define a public class or an interface in a Java source file, the
 * names of the class or interface and Java source file must match. Also, a
 * source code file can’t define more than one public class or interface. If you
 * try to do so, your code won’t compile,
 */
// public interface Printable {
// // .. we are not detailing this part
// }

// If we change to below it will work
// public interface Java_01_Basics {
//
// }
//
// interface Movable {
// // .. we are not detailing this part
// }

// =====================
// This will not work as public interce and class both
// interface Printable {
// // .. we are not detailing this part
// }
//
// class MyClass {
// // .. we are not detailing this part
// }
//
// interface Movable {
// // .. we are not detailing this part
// }
//
// public class Car {
// // .. we are not detailing this part
// }
//
// public interface Multiple2 {
// }

// ================
// working code
// interface Printable {
// // .. we are not detailing this part
// }
//
// class MyClass {
// // .. we are not detailing this part
// }
//
// interface Movable {
// // .. we are not detailing this part
// }
//
// public class Java_01_Basics {
// // .. we are not detailing this part
// }
//
// interface Multiple2 {
// }
// ===============
// public class Java_01_Basics {
// public static void main(String args[]) {
// System.out.println("Hello exam");
// }
// }
// =================

// public class Java_01_Basics {
// public static void main(String... args) {
// System.out.println("Hello exam");
// }
// }
// =============

// public class Java_01_Basics {
// public static void main(String args...) {//This won’t compile. Ellipsis must
// follow the data type, String.
// System.out.println("Hello exam");
// }
// }

// ==================
// public class Java_01_Basics {
// public static void main(String[] arguments) {
// System.out.println("Hello exam");
// }
// }
// =================
// public class Java_01_Basics {
// public static void main(String[] HelloWorld) {
// System.out.println("Hello exam");
// }
// }
// ==================================
// public class Java_01_Basics {
// static public void main(String[] HelloWorld) { // static and public are
// interchangable
// System.out.println("Hello exam");
// }
// }
// ==============================
// public class Java_01_Basics {
// public static void main(String args) {
// System.out.println("Hello exam 2");
// }
//
// public static void main(String args[]) {
// System.out.println("Hello exam");// JVM will execute this main method.
//
// }
//
// public static void main(int number) {
// System.out.println("Hello exam 3");
// }
// }
// =========================
// command line execution
// public class Java_01_Basics {
// public static void main(String args[]) {
// System.out.println("Hello exam");
// }
// }
// ======================
// command line parameter java EJava java one one
// out put java one
// class Java_01_Basics {
// public static void main(String sun[]) {
// System.out.println(sun[0] + " " + sun[2]);
// }
// }

// class EJava {
// static public void main(String phone[]) { System.out.println(phone[0] + " " +
// phone[1]);
// }
// }
// c class EJava {
// static public void main(String[] arguments[]) {
// System.out.println(arguments[0] + " " + arguments[1]);
// }
// }
// d class EJava {
// static void public main(String args[]) { System.out.println(args[0] + " " +
// args[1]);
// }
// }
// =======================
// import certification.another.AnotherPackage;
//
// class Java_01_Basics {
// public static void main(String sun[]) {
// AnotherPackage a;
// }
// }
// ==================
// import certification.another.AnotherPackage;
//
// class Java_01_Basics {
// public static void main(String sun[]) {
// AnotherPackage a;
// }
// }
// =================
// import certification.another ;
////
// class Java_01_Basics {
// public static void main(String sun[]) {
//
// certification.another.AnotherPackage a;
// }
// }
// ==============
///
// class Java_01_Basics {
// public static void main(String sun[]) {
//
// certification.another.AnotherPackage a;
// }
// }
// ======================
// import java.util.Date;
//
// class AnnualExam {
// Date date1;
// java.sql.Date date2;
// }
// ========================
// import certification.another.AnotherPackage;
//
// class AnnualExam {
// AnotherPackage eq;
// AnotherPackage1 mc;
//
// }

// =================
// Static import

// import static certification.another.ExamQuestion.marks;// Correct statement
// is import static, not static import
//
// class AnnualExam {
// AnnualExam() {
//
// marks = 20;
//
// }
// }
// =====================

// Imports all static members of class ExamQuestion
// import static certification.another.ExamQuestion.print;
// import static certification.another.ExamQuestion.marks;
// import static certification.another.ExamQuestion.print;
//
// class AnnualExam {
// AnnualExam() {
//
// marks = 20;
// print();
// }
// }

// =============================
// import certification.another.Book;
//
////
// public class Java_01_Basics {
// Java_01_Basics() {
// Book book = new Book();
// String value = book.isbn;
// book.printBook();
// }
// }
// ======================
// Non Access modifier -- Abstract class
// an abstract class can not be instantiated
// An abstract class may or may not define an abstract method. But a concrete
// class can’t define an abstract method.
// abstract class Person {
// private String name;
//
// public void displayName() {
// }
// }
//
// class University {
// Person p = new Person();// This line of code won’t compile.
//
// }
// ===================
// Final =-- can not reassigned
// class Person {
// final long MAX_AGE;
//
// Person() {
// MAX_AGE = 99;// Compiles successfully: value assigned once to final variable
//
// }
// }
// =================
// class Person {
// final long MAX_AGE = 90;
//
// Person() {
// MAX_AGE = 99;// Won’t compile; reassignment not allowed
//
// }
// }
// =================
// class Person {
// final StringBuilder name = new StringBuilder("Sh");
//
// //
// Person() {
// name.append("reya"); // Can call methods on a final variable that change its
// // state
//
// name = new StringBuilder();
//
// } // Won’t compile. You can’t reassign
// }

// ==============
// static variable
// class Emp {
// String name;
// static int bankVault;// We want this value to be shared by all the objects of
// class Emp.
//
// }
//
////
// class Java_01_Basics {
// public static void main(String[] args) {
// Emp emp1 = new Emp();
// Emp emp2 = new Emp();
// emp1.bankVault = 10;
// emp2.bankVault = 20;
// System.out.println(emp1.bankVault);
// System.out.println(emp2.bankVault);
// System.out.println(Emp.bankVault);
// }
// }
// ==================
// class Emp {
// public static final int MIN_AGE = 20;
// static final int MAX_AGE = 70;
// }
// =================
// static methods aren’t associated with objects and can’t use any of the
// instance variables of a class.
// You can define static methods to access or manipulate static variables:

// class Emp {
// String name;
// static int bankVault;
//
// static int getBankVaultValue() {
// return bankVault;
// }
// }

// ==============
//
// class MyClass {
// static int x = result();
//
// static int result() {
// return 20;
// }
//
// int nonStaticResult() {
// return result();
// }
// }

// ======================
//
// class Emp {
// static int bankVault;
//
// static int getBankVaultValue() {
// return bankVault;
// }
//
// void getBankVaultValue1() {
// System.out.println(name);
// }
//
// String name;
//
// }
//
// public class Java_01_Basics {
// public static void main(String[] args) {
// Java_01_Basics emp = null;
// // System.out.println(emp.bankVault);
// // System.out.println(emp.bankVault);
// // System.out.println(a);
//
// int a = 10;
// // System.out.println(emp.getBankVaultValue());
//
// }
// }
// ==============