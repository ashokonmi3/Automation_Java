package collectiontutorial;
import java.util.Iterator;
import java.util.Stack;

//public class Collection_03_Vector_stack {
//	public static void main(String args[]) {
//		Vector<String> v = new Vector<String>();
//		v.add("Ayush");
//		v.add("Amit");
//		v.add("Ashish");
//		v.add("Garima");
//		Iterator<String> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
//}
// ========================
// The stack is the subclass of Vector.
// It implements the last-in-first-out data structure, i.e., Stack.
// The stack contains all of the methods of Vector class and also provides its
// methods
// like boolean push(), boolean peek(), boolean push(object o), which defines
// its properties.

public class Collection_03_Vector_stack {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**********************");

		stack.pop();
		Iterator<String> itr1 = stack.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}