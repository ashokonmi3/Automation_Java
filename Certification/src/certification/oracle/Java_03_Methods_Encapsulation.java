package certification.oracle;

// public class Java_03_Methods_Encapsulation {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
//
// }
//
// }
//
// class Student {
//
// private double marks1, marks2, marks3;
// private double maxMarks = 100;
//
// // public double getAverage() {
// // double avg = 0;
// //
// // avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
// // return avg;
// // }
//
// // public void setAverage(double val) {
// // avg = val;
// // }
// public void localVariableInLoop() {
// for (int ctr = 0; ctr < 5; ++ctr) {
// System.out.println(ctr);
// }
// System.out.println(ctr);
// }
//
// public double getAverage() {
// if (maxMarks > 0) {
// double avg = 0;
// avg = (marks1 + marks2 + marks3) / (maxMarks * 3) * 100;
// return avg;
//
// // Variable avg is local to if block
//
// } else {
// avg = 0;
// return avg;
//
// // Variable avg can’t be accessed because it’s local to the if block.
// Variables
// // local to the if block can’t be accessed in the else block.
//
// }
// }
//
// }
// =============

// class Phone {
// private boolean tested;
//
// public void setTested(boolean val) {
// tested = val;
// }
//
// public boolean isTested() {
// val = false;// Method parameter val is accessible only in method setTested
//
// // Variable val can’t be accessed in method isTested
//
// return tested;
// }
//
// boolean isPrime(int num) {
// if (num <= 1)
// return false;
// boolean result = true;
// for (int ctr = num - 1; ctr > 1; ctr--) {
// if (num % ctr == 0)
// result = false;
// }
// return result;
//
// }
//
// }
// ================

// class Phone {
// private boolean tested;
//
// public void setTested(boolean val) {
// tested = val;
//
// // Instance variable tested
// // Variable tested is accessible in method setTested
//
// }
//
// public boolean isTested() {
// return tested;
//
// // Variable tested is also accessible in method isTested
//
// }
// }
// ===========
// class Phone {
// static boolean softKeyboard = true; // Class variable softKeyboard
//
// }
//
// class Java_03_Methods_Encapsulation {
// public static void main(String[] args) {
// Phone.softKeyboard = false;
// Phone p1 = new Phone();
// Phone p2 = new Phone();
// System.out.println(p1.softKeyboard);
// Phone p3 = null;
// System.out.println(p3.softKeyboard);// Won’t throw an exception,
//
// // Accesses the class variable by using the name of the class. It can be
// // accessed even before any of the class’s objects exist.
//
// // Prints false. A class variable can be read by using objects of the class.
//
// // Prints false
//
// }
// }
// =============

// class MyPhone {
// static boolean softKeyboard = true;
// boolean softKeyboard = true;
//
// // Won’t compile. Class variable and instance variable can’t be defined using
// // the same name in a class.
//
// }
//
// class MyPhone {
// static boolean softKeyboard = true;
// String phoneNumber;
//
// void myMethod() {
// boolean softKeyboard = true;
// String phoneNumber;
//
// // Class variable
// // softKeyboard Instance variable phoneNumber
//
// // Local variable softKeyboard can coexist with class variable softKeyboard
//
// }
// }
// ===============

// class Phone {
// String phoneNumber = "123456789";
//
// void setNumber() {
// String phoneNumber;
// phoneNumber = "987654321";
// }
// }
//
// class Java_03_Methods_Encapsulation {
// public static void main(String[] args) {
// Phone p1 = new Phone();
// p1.setNumber();
// System.out.println(p1.phoneNumber);
// }
// }
// ================

// class Exam {
// String name;
//
// public void setName(String newName) {
// name = newName;
// }
//
// public void myMethod() {
// int result = 88;
// if (result > 78) {
//
// Exam myExam1 = new Exam();
// myExam1.setName("Android");
// }
//
// // b Scope of local variable myExam1
//
// else {
// Exam myExam2 = new Exam();
// myExam2.setName("MySQL");
//
// // c Start of else block
//
// }
// }
//
// }
//
// class Java_03_Methods_Encapsulation {
// public static void main(String args[]) {
// Exam myExam = new Exam();
// myExam.setName("OCA Java Programmer 1");
// System.out.println(myExam.name);
//
// myExam = null;
//
// // b Object
// // creation c
//
// // Access method
//
// myExam = new Exam();
// myExam.setName("PHP");
// System.out.println(myExam.name);
//
// }
// }
// =============

// class Exam {
// String name;
//
// public Exam(String name) {
// this.name = name;
// }
// }
//
// class Java_03_Methods_Encapsulation {
// public static void main(String args[]) {
// Exam myExam = new Exam("PHP");
// myExam = null;
// myExam = new Exam("SQL");
// myExam = new Exam("Java");
// Exam yourExam = new Exam("PMP");
// yourExam = myExam;
// System.out.println(myExam.name);
// System.out.println(yourExam.name);
// System.out.println(yourExam == myExam);
//
// }
// }
// ==============
// class Exam {
// private String name;
// private Exam other;
//
// public Exam(String name) {
// this.name = name;
//
// }
//
// public void setExam(Exam exam) {
// other = exam;
// }
// }
//
// class IslandOfIsolation {
// public static void main(String args[]) {
// Exam php = new Exam("PHP");
// Exam java = new Exam("Java");
// php.setExam(java);
// java.setExam(php);
// php = null;
//
// java = null;
// }
// }
// ======================
// class Phone {
// double weight;
//
// void setWeight(double val) {
// weight = val;
// }
//
// double getWeight() {
// return weight;
// }
// }

// class Java_03_Methods_Encapsulation {
//
// public static void main(String args[]) {
// Phone p = new Phone();
// double newWeight = p.setWeight(20.0);
// }
// }

// class EJavaTestMethods2 {
// public static void main(String args[]) {
// Phone p = new Phone();
// double newWeight = p.getWeight();
// int newWeight2 = (int) p.getWeight();
// }
//
// }

// class EJavaTestMethods2 {
// public static void main(String args[]) {
// Phone p = new Phone();
// double newWeight = p.getWeight();
// boolean newWeight2 = (boolean) p.getWeight();
// }
// }

// ==================
// class Employee {
// public int daysOffWork(int... days) {
// int daysOff = 0;
// for (int i = 0; i < days.length; i++)
// daysOff += days[i];
// return daysOff;
// }
// }
// ===========

// class Employee {
//
// public int daysOffWork(String... months, int... days) {
// int daysOff = 0;
// for (int i = 0; i < days.length; i++)
// daysOff += days[i];
// return daysOff;
// }
// }
// ========
// class Employee {
// double weight;
//
// public int daysOffWork(int... days, String year) {
// int daysOff = 0;
// for (int i = 0; i < days.length; i++)
// daysOff += days[i];
// return daysOff;
// }

// void setWeight(double val) {
// return;
// weight = val;
// }

// void setWeight(double val) {
// if (val < 0)
// return;
// else
// weight = val;
// }

// double calcAverage(int[] marks) {
// // return a double value
// }
//
// double calcAverage1(int... marks) {
// // return a double value

// Arguments: array

// Arguments: int… (varags)

// double calcAverage(int marks1, int marks2) {
// return (marks1 + marks2) / 2.0;
// }
//
// int calcAverage(int marks1, int marks2) {
// return (marks1 + marks2) / 2;
//
// // Return type of method calcAverage is double
//
// // Return type is int
//
// }
//
// }
// ======================
// class Employee {
// String name;
// int age;
//
// Employee() {
// age = 20;
// System.out.println("Constructor");
// }
// }
//
// class Office {
// public static void main(String args[]) {
// Employee emp = new Employee();
// System.out.println(emp.age);
// // Access and print the value of variable age
//
// }
// }
// =======================
// class Employee {
// String name;
// int age;
//
// Employee(int newAge, String newName) {
// name = newName;
// age = newAge;
// System.out.println("Constructor");
// }
// }
//
// class Office {
// public static void main(String args[]) {
// Employee emp = new Employee(30, "Pavni Gupta");
// }
// }
// =============

// class Employee {
// String name;
// int age;
//
// Employee() {
// this(null, 0);// No-argument constructor
//
// }
//
// Employee(String newName, int newAge) {
// name = newName;
// age = newAge;
// }
// }
// =================

// class Employee {
// String name;
// int age;
//
// Employee() {
// Employee(null, 0);// Won’t compile—you can’t invoke a constructor within a
// class by using the
// // class’s name.
//
// }
//
// Employee(String newName, int newAge) {
// name = newName;
// age = newAge;
//
// }
// }
// ====================
// class Employee {
// String name;
// int age;
//
// Employee() {
// System.out.println("No-argument constructor");// Won’t compile— the call to
// the overloaded constructor must be
// // the first statement in a constructor.
// this(null, 0);
// }
//
// Employee(String newName, int newAge) {
// name = newName;
// age = newAge;
//
// }
// }
//===========
//class Employee {
//	String name;
//	int age;
//
//	Employee() {
//		this();
//	}
//
//	Employee(String newName, int newAge) {
//		name = newName;
//		age = newAge;
//	}
//}
//================
//class Star {
//	double starAge;
//
//	public void setAge(double newAge) {
//		starAge = newAge;
//	}
//
//	public double getAge() {
//		return starAge;
//	}
//}
//==========
//class Employee {
//
//	String name;
//	int age;
//
//	Employee() {
//		age = 22;
//	}
//
//	public void setName(String val) {
//		name = val;
//	}
//
//	public void printEmp() {
//
//		System.out.println("name = " + name + " age = " + age);
//	}
//}
//
//class Office {
//	public static void main(String args[]) {
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		e1.name = "Selvan";
//		e2.setName("Harry");
//		e1.printEmp();
//		e2.printEmp();
//	}
//}
//==============
//default values for object properties
//class Employee {
//	String name;
//	int age;
//
//	public void printEmp() {
//
//		System.out.println("name = " + name + " age = " + age);
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void main(String args[]) {
//		Employee e1 = new Employee();
//		e1.printEmp();
//	}
//}
//==========

//class Employee {
//	private String name;// Object field with private access
//
//	int age;//
//
//	Employee() {
//		age = 22;// Assign value to age
//
//	}
//
//	public void setName(String val) {
//		name = val;
//
//	}
//
//	public void printEmp() {
//		System.out.println("name = " + name + " age = " + age);
//	}
//}
//==================
//Methods that accept varargs parameters can be called with a different count of actual arguments. 
//Also, a method that accepts a vararg can be
//invoked with an array in place of the vararg.

//class Employee {
//	private String name;
//
//	public void setName(String val) {
//		name = val;
//	}
//
//	public int daysOffWork(int... days) {
//		int daysOff = 0;
//		for (int i = 0; i < days.length; i++)
//			daysOff += days[i];
//		return daysOff;
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//
//	public static void main(String args[]) {
//		Employee e = new Employee();
//		System.out.println(e.daysOffWork(1, 2, 3, 4));
//		System.out.println(e.daysOffWork(1, 2, 3));
//	}
//}
//===========

//class Employee {
//	private String name;
//
//	public void setName(String val) {
//		name = val;
//	}
//
//	public String getName() {
//		return name;
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//	//
//	public static void main(String args[]) {
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		String name = e1.getName();
//		e2.setName(e1.getName());
//	}
//}

//=============
//class Phone {
//	String model;
//	String company;
//	double weight;
//
//	void makeCall(String number) {
//	}
//
//	void receiveCall() {
//	}
//
//}
//
//class Home {
//	public static void main() {
//		Phone ph = new Phone();
//		ph.weight = -12.23;
//
//	}
//}
//=============
//class Phone {
//	private double weight;
//
//	public void setWeight(double val) {
//		if (val >= 0 && val <= 1000) {
//			weight = val;
//
//		}
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void main(String[] args) {
//		Phone ph = new Phone();
//		ph.setWeight(-12.23);
//
//		System.out.println(ph.getWeight());
//		ph.setWeight(77712.23);
//		System.out.println(ph.getWeight());
//		ph.setWeight(12.23);
//		System.out.println(ph.getWeight());
//	}
//}
//===============
//
//class Employee {
//	int age;
//
//	void modifyVal(int a) {
//		a = a + 1;
//		System.out.println(a);
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void main(String args[]) {
//		Employee e = new Employee();
//		System.out.println(e.age);
//		e.modifyVal(e.age);
//		System.out.println(e.age);
//	}
//}
//=============
//class Person {
//	private String name;
//
//	Person(String newName) {
//		name = newName;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String val) {
//		name = val;
//	}
//
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void swap(Person p1, Person p2) {
//		Person temp = p1;
//		p1 = p2;
//		p2 = temp;
//
//	}
//
//	public static void main(String args[]) {
//		Person person1 = new Person("John");
//		Person person2 = new Person("Paul");
//		System.out.println(person1.getName() + ":" + person2.getName());
//		swap(person1, person2);
//		System.out.println(person1.getName() + ":" + person2.getName());
//	}
//}
//==================
//class Person {
//	private String name;
//
//	Person(String newName) {
//		name = newName;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String val) {
//		name = val;
//	}
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void resetValueOfMemberVariable(Person p1) {
//		p1.setName("Rodrigue");
//
//	}
//
//	public static void main(String args[]) {
//		Person person1 = new Person("John");
//		System.out.println(person1.getName());
//
//		resetValueOfMemberVariable(person1);
//		System.out.println(person1.getName());
//	}
//}
//=============
//class Person {
//	public String name;
//	public int height;
//}
//
//class Java_03_Methods_Encapsulation {
//	public static void main(String args[]) {
//		Person p = new Person();
//		p.name = "EJava";
//		anotherMethod(p);
//		System.out.println(p.name);
//		someMethod(p);
//		System.out.println(p.name);
//	}
//
//	static void someMethod(Person p) {
//		p.name = "someMethod";
//		System.out.println(p.name);
//	}
//
//	static void anotherMethod(Person p) {
//		p = new Person();
//		p.name = "anotherMethod";
//		System.out.println(p.name);
//	}
//}
//==========
class Java_03_Methods_Encapsulation {
	public static void main(String args[]) {
		int ejg = 10;
		anotherMethod(ejg);
		System.out.println(ejg);
		someMethod(ejg);
		System.out.println(ejg);
		String morning1 = "Morning";
		System.out.println("Morning" == morning1);
		String morning2 = new String("Morning");
		System.out.println("Morning" == morning2);

	}

	static void someMethod(int val) {
		++val;
		System.out.println(val);
	}

	static void anotherMethod(int val) {
		val = 20;
		System.out.println(val);
	}
}
// ================
