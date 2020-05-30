package corejavapackage;

//class ArrayListDemo {

//	public static void main(String args[]) {
//		// Create an array list.
//		ArrayList<String> al = new ArrayList<String>();
//		System.out.println("Initial size of al: " + al.size());
//		// Add elements to the array list.
//		al.add("C");
//		al.add("A");
//		al.add("E");
//		al.add("B");
//		al.add("D");
//		al.add("F");
//		al.add(1, "A2");
//		System.out.println("Size of al after additions: " + al.size());
//		// Display the array list.
//		System.out.println("Contents of al: " + al);
//		// Remove elements from the array list.
//		al.remove("F");
//		al.remove(2);
//		System.out.println("Size of al after deletions: " + al.size());
//		System.out.println("Contents of al: " + al);
//	}
//}
// ======================================
// Convert an ArrayList into an array.
//Demonstrate ArrayList.
//import java.util.ArrayList;
//
//class CollectionDemo {
//	public static void main(String args[]) {
//		// Create an array list.
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		// Add elements to the array list.
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(4);
//		System.out.println("Contents of al: " + al);
//		// Get the array.
//		Integer ia[] = new Integer[al.size()];
//		ia = al.toArray(ia);
//		int sum = 0;
//		// Sum the array.
//		for (int i : ia)
//			sum += i;
//		System.out.println("Sum is: " + sum);
//	}
//}
// =======================================
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//
////Demonstrate iterators.
//
//class CollectionDemo {
//	public static void main(String args[]) {
//		// Create an array list.
//		ArrayList<String> al = new ArrayList<String>();
//		// Add elements to the array list.
//		al.add("C");
//		al.add("A");
//		al.add("E");
//		al.add("B");
//		al.add("D");
//		al.add("F");
//
//		//// Use iterator to display contents of al.
//		//
//		System.out.print("Original contents of al: ");
//		//
//		Iterator<String> itr = al.iterator();
//		//
//		while (itr.hasNext()) {
//			//
//			String element = itr.next();
//			//
//			System.out.print(element + " ");
//		}
//		System.out.println();
//		////// Modify objects being iterated.
//		ListIterator<String> litr = al.listIterator();
//		while (litr.hasNext()) {
//			String element = litr.next();
//			litr.set(element + "+");
//		}
//		System.out.print("Modified contents of al: ");
//		itr = al.iterator();
//		while (itr.hasNext()) {
//			String element = itr.next();
//			System.out.print(element + " ");
//		}
//		System.out.println();
//		////// Now, display the list backwards.
//		System.out.print("Modified list backwards: ");
//		while (litr.hasPrevious()) {
//			String element = litr.previous();
//			System.out.print(element + " ");
//		}
//		System.out.println();
//	}
//}

// ========================================

// Use the for-each for loop to cycle through a collection.
//import java.util.ArrayList;
//
//class CollectionDemo {
//	public static void main(String args[]) {
//		// Create an array list for integers.
//		ArrayList<Integer> vals = new ArrayList<Integer>();
//		// Add values to the array list.
//		vals.add(1);
//		vals.add(2);
//		vals.add(3);
//		vals.add(4);
//		vals.add(5);
//		// Use for loop to display the values.
//		System.out.print("Contents of vals: ");
//		for (int v : vals)
//			System.out.print(v + " ");
//		System.out.println();
//		// Now, sum the values by using a for loop.
//		int sum = 0;
//		for (int v : vals)
//			sum += v;
//		System.out.println("Sum of values: " + sum);
//	}
//}

// ==========================================

// A simple Spliterator demonstration.
import java.util.ArrayList;
import java.util.Spliterator;

class CollectionDemo {
	public static void main(String args[]) {
		// Create an array list for doubles.
		ArrayList<Double> vals = new ArrayList<>();
		// Add values to the array list.
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		// Use tryAdvance() to display contents of vals.
		System.out.print("Contents of vals:\n");
		Spliterator<Double> spltitr = vals.spliterator();
		while (spltitr.tryAdvance((n) -> System.out.println(n)))
			;
		System.out.println();
		// Create new list that contains square roots.
		spltitr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))))
			;
		// Use forEachRemaining() to display contents of sqrs.
		System.out.print("Contents of sqrs:\n");
		spltitr = sqrs.spliterator();
		spltitr.forEachRemaining((n) -> System.out.println(n));
		System.out.println();
	}
}

/*
 * The LinkedList Class The LinkedList class extends AbstractSequentialList and
 * implements the List, Deque, and Queue interfaces. It provides a linked-list
 * data structure.
 */

// Demonstrate LinkedList.
// import java.util.LinkedList;
//
// class CollectionDemo {
// public static void main(String args[]) {
// // Create a linked list.
// LinkedList<String> ll = new LinkedList<String>();
// // Add elements to the linked list.
// ll.add("F");
// ll.add("B");
// ll.add("D");
// ll.add("E");
// ll.add("C");
// ll.addLast("Z");
// ll.addFirst("A");
// ll.add(1, "A2");
// System.out.println("Original contents of ll: " + ll);
// //// Remove elements from the linked list.
// ll.remove("F");
// ll.remove(2);
// System.out.println("Contents of ll after deletion: " + ll);
// //// Remove first and last elements.
// ll.removeFirst();
// ll.removeLast();
// System.out.println("ll after deleting first and last: " + ll);
// //// Get and set a value.
// String val = 11.get(2);
// ll.set(2, val + " Changed");
// // System.out.println("ll after change: " + ll);
// }
// }

// =============================

// Demonstrate HashSet.
// import java.util.HashSet;
//
// class CollectionDemo {
// public static void main(String args[]) {
// // Create a hash set.
// HashSet<String> hs = new HashSet<String>();
// // Add elements to the hash set.
// hs.add("Beta");
// hs.add("Alpha");
// hs.add("Eta");
// hs.add("Gamma");
// hs.add("Epsilon");
// hs.add("Omega");
// System.out.println(hs);
// }
// }
