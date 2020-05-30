package certification.oracle;

// public class Java_02_Data_Types {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// /*
// *
// */
// boolean voucherPurchased=true;boolean examPrepStarted=false;byte
// num=100;short sum=1240;int total=48764;long population=214748368;int
// baseDecimal=267;int octVal=0413;int hexVal=0x10B; /
//
// int binVal=0b100001011;long baseDecimal1=100_267_760;long octVal1=04_13;long
// hexVal1=0x10_BA_75;long binVal1=0b1_0000_10_11;
//
// int intLiteral=_100;int intLiteral2=100_999_;long longLiteral=100_ L
//
// }
//
// }

// =========================
// class Java_02_Data_Types {
// public static void main(String args[]) {
// int baseDecimal = 267;
// int octVal = 0413;
// int hexVal = 0x10B;
// int binVal = 0b100001011;
// System.out.println(baseDecimal + octVal);
// System.out.println(hexVal + binVal);
// }
// }
// ===========
// class Java_02_Data_Types {
// public static void main(String args[]) {
//
// long var1=0_100_267_760;long var2=0_ x_4_13;long var3=0b_ x10_BA_75;long
// var4=0b_ 10000_10_11;long var5=0xa10_A G_75;long var6=0x1_0000_10;long
// var7=100 12_12;
// }
// }

// ===============
// class Java_02_Data_Types {
// public static void main(String args[]) {
// char c1 = 122;
// System.out.println(c1);
// char c2 = '\u0122';
// System.out.println("c1 = " + c1);
// System.out.println("c2 = " + c2);
// char c3 = (char) -122;
//
// char c4 = 122;
// System.out.println("char(c3) = " + c3);
//
// System.out.println("c4 = " + c4);
// }
// }
// ====================

// public class Java_02_Data_Types {
// public static void main(String[] args) {
// int myInt = 7;
// byte exam_total = 7;
// int DATA-COUNT;
// bool result = true;
// if (result == true)
// do
// System.out.println(myInt);
// while (myInt > 10);
// }
// }

// ============
// class EJava {
// public EJava() {
// this(7);
// System.out.println("public");
// }
//
// private EJava(int val) {
// this("Sunday");
// System.out.println("private");
// }
//
// protected EJava(String val) {
// System.out.println("protected");
// }
// }
//
// class Java_02_Data_Types {
// public static void main(String[] args) {
// EJava eJava = new EJava();
// }
// }

// ==================
// class Java_02_Data_Types {
// public static void main(String[] args) {
// double myDouble2 = 10.2;
// int a = 10;
// int b = a;
// float float1 = 10.2F;
// float float2 = float1;//
// b += a;
// a = b = 10;
// b -= a;
// a = b = 10;
// b *= a;
// a = b = 10;
// b /= a;

// double myDouble2 = true;
// boolean b = 'c';
// boolean b1 = 0;
//
// be assigned to double.
//
// be assigned to boolean.
//
// boolean b2 -= b1;

// boolean b1, b2, b3, b4, b5, b6;
// b1 = b2 = b3 = true;
// b4 = 0;
//// b5 = 'false';
// b6 = yes;
//
//
// }
// }
// ==============
/*
 * All byte, short, and char values are automatically widened to int when used
 * as oper- ands for arithmetic operations. If a long value is involved
 * somewhere, then every- thing, including int values, is widened to long. This
 * explains why you can’t assign the sum of two byte values to a short type:
 */
// class Java_02_Data_Types {
// public static void main(String[] args) {
//
// char char1 = 'a';
// System.out.println(char1);
// System.out.print(char1 + char1);
// System.out.print(char1 - char1);
// byte age1 = 10;
// byte age2 = 20;
// short sum = age1 + age2;
// // this will work if they are final
//
// final byte age3 = 10;
// final byte age4 = 20;
// short sum1 = age3 + age4;
//
// }
// }

// ==============

// class Java_02_Data_Types {
// public static void main(String[] args) {
//
// char char1 = 'a';
// System.out.println(char1);
// System.out.print(char1 + char1);
// System.out.print(char1 - char1);
// byte age1 = 10;
// byte age2 = 20;
// int sum = age1 + age2;
//
// }
// }
// ================
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 20;
// int b = 10;
// int c = a - ++b;
// System.out.println(c);
// System.out.println(b);
// }
// }
// =============
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 50;
// int b = 10;
// int c = a - b++;
// System.out.println(c);
// System.out.println(b);
// }
// }

// =============

// class Java_02_Data_Types {
// public static void main(String[] args) {
//
// double d = 20.0;
// double e = 10.0;
// double f = d * --e;
//
// System.out.println(f);
// System.out.println(e);
// }
// }
// ===============
// class Java_02_Data_Types {
// public static void main(String[] args) {
//
// int a = 10;
// a = a++ + a + a-- - a-- + ++a;
// // 10+11+11-10+10 left to right direction
// System.out.println(a);
//
// int b = 10;
// b = ++a + a + --a - --a + a++; System.out.println (a);
//
// }
// }
// ============
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 10;
// a = ++a + a + --a - --a + a++;
// System.out.println(a);
//
// }
// }
// =================
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int i1 = 10;
// int i2 = 20;
// System.out.println(i1 >= i2);
// long long1 = 10;
// long long2 = 20;
// System.out.println(long1 <= long2);
// }
// }
// =============================

// class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// System.out.println(a = b);
// boolean b1 = false;
// System.out.println(b1 = true);
// System.out.println(b1 = false);
//
// }
// }
// ==================

// If the first oper- and to this operator evaluates to false, the result can
// never be true.
// Therefore, && does not evaluate the second operand. Similarly,
// the || operator does not evaluate the second operator if the first operand
// evaluates to true.
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int marks = 8;
// int total = 10;// b Prints false
// System.out.println(total < marks && ++marks > 5);
// System.out.println(marks);// c Prints 8
// System.out.println(total == 10 || ++marks > 10);
// System.out.println(marks);
//
// }
// }
// ===================
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// int c = 40;
// System.out.println(a++ > 10 || ++b < 30); // line1
// System.out.println(a > 90 && ++b < 30);
// System.out.println(!(c > 20) && a == 10);
// System.out.println(a >= 99 || a <= 33 && b == 10);
// System.out.println(a >= 99 && a <= 33 || b == 10);
//
// }
// }
// ================
// class Java_02_Data_Types {
// public static void main(String[] args) {
// int int1 = 10, int2 = 20, int3 = 30;
// System.out.println(int1 % int2 * int3 + int1 / int2);
//// (int1 % int2) *( int3 + int1 / int2)
//// (int1 % int2) *( int3 + (int1 / int2))
//
// }
// }
// ================

// class Java_02_Data_Types {
// public static void main(String[] args) {
// Boolean bool2 = new Boolean(true);
// Character char2 = new Character('a');
// Byte byte2 = new Byte((byte) 10);
// Double double2 = new Double(10.98);
//
// // Character char3 = new Character("a");
// Boolean bool3 = new Boolean("true");
// Byte byte3 = new Byte("10");
// Double double3 = new Double("10.98");
//
// Boolean bool4 = Boolean.valueOf(true);
// Boolean bool5 = Boolean.valueOf(true);
// Boolean bool6 = Boolean.valueOf("TrUE");
// Double double4 = Double.valueOf(10);
//
// Long.parseLong("124");
// // Byte.parseByte("1234");
// Boolean.parseBoolean("false");
// Boolean.parseBoolean("TrUe");

// ----------------
// Wrapper classes Byte, Short, Integer, and Long cache objects with values in
// the range of -128 to 127.
// The Character class caches objects with values 0 to 127.
// These classes define inner static classes that store objects for the
// primitive values -128 to 127 or 0 to 127 in an array. If you request an
// object of any of these classes, from this range, the valueOf() method returns
// a reference to a predefined object; otherwise,
// it cre- ates a new object and returns its reference:

// Long var1 = Long.valueOf(123);
// Long var2 = Long.valueOf("123");
// System.out.println(var1 == var2);
// Long var3 = Long.valueOf(223);
// Long var4 = Long.valueOf(223);
// System.out.println(var3 == var4);
// -----------------
//
// Integer i1 = new Integer(10);
// Integer i2 = new Integer(10);
// Integer i3 = Integer.valueOf(10);
// Integer i4 = Integer.valueOf(10);
// Integer i5 = 10;
// Integer i6 = 10;
// System.out.println(i1 == i2);
// System.out.println(i3 == i4);
// System.out.println(i4 == i5);
// System.out.println(i5 == i6);
//
// System.out.println(i1.equals(i2));
// System.out.println(i3.equals(i4));
// System.out.println(i4.equals(i5));
// System.out.println(i5.equals(i6));
// --------------------
// No caching for value bigger than 12
// Integer i1 = new Integer(200);
// Integer i2 = new Integer(200);
//
// Integer i3 = Integer.valueOf(200);
// Integer i4 = Integer.valueOf(200);
//
// Integer i5 = 200;
// Integer i6 = 200;
// int a = 10;
// int b = 10;
//
// System.out.println(i1 == i2);
// System.out.println(i3 == i4);
// System.out.println(i4 == i5);
// System.out.println(i5 == i6);
// System.out.println(a == b);
// --------------------
// u cant compare 2 different wrapper class objects
// Integer obj1 = 100;
//
// Short obj2 = 100;
// System.out.println(obj1.equals(obj2));
// System.out.println(obj1 == obj2);
//
// }
// }
// ==============

// public class Java_02_Data_Types {
//
// public static void main (String args[]) { ArrayList<Double> list = new
// ArrayList<Double>(); list.add(12.12);
// list.add(11.24); Double total = 0.0; for (Double d : list)
//
//// List of Double
//// Autoboxing—add double
//
// total += d;
// }
// }
// ============

// public class Java_02_Data_Types {
// public static void main(String args[]) {
// ArrayList list = new ArrayList();
// list.add(new Double(12.12D));
// list.add(new Double(11.24D));
// }
//
// Double total = Double.valueOf(0.0D);
//
// for(
// Iterator iterator = list.iterator();iterator.hasNext();)
// {
// Double d = (Double) iterator.next();
// total = total.doubleValue() + d.doubleValue();
// }
// }}
// ===================
// Quiz
// public class Java_02_Data_Types {
// public static void main(String args[]) {
// int myChar = 97;
// int yourChar = 98;
// System.out.print((char) myChar + (char) yourChar);
// int age = 20;
// System.out.print(" ");
// System.out.print((float) age);
// -------------
// char a = 'a'; // line 3
// char b = -10; // line 4
// char c = '1'; // line 5
// integer d = 1000; // line 6
// System.out.println(++a + b++ * c - d);
//
// }}

// public class Java_02_Data_Types {
// public static void main(String[] args) {
// int a = 10;
// long b = 20;
// short c = 30;
// System.out.println(++a + b++ * c);
// }
// }

// ======================
public class Java_02_Data_Types {
	public static void main(String[] args) {

		//// Boolean buy = new Boolean(true);
		//// Boolean sell = new Boolean(true);
		//// System.out.print(buy == sell);
		//// double a = 10;
		//// boolean buyPrim = buy.booleanValue();
		//// System.out.print(!buyPrim);
		////
		//// System.out.print(buy && sell);
		//
		// int a = 10; int b = 20;
		// int c = (a * (b + 2)) - 10-4 * ((2*2) - 6;
		// System.out.println(c);

		// ------------
		// int num1 = 12; // line 3
		// float num2 = 17.8f; // line 4
		// boolean eJavaResult = true; // line 5
		// boolean returnVal = num1 >= 12 && num2 < 4.567 || eJavaResult == true;
		// System.out.println(returnVal);
		// -----------------

		boolean myBool = false; // line 1
		int yourInt = 10; // line 2
		float hisFloat = 19.54f; // line 3
		System.out.println(hisFloat = yourInt); // line 4
		System.out.println(yourInt > 10); // line 5
		System.out.println(myBool = false);

	}
}
