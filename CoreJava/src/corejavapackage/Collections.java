package corejavapackage;

// Demonstrate iterators.

//class Collections {
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
//
//		System.out.print("Original contents of al: ");
//		// //
//		Iterator<String> itr = al.iterator();
//		// //
//		while (itr.hasNext()) {
//			// //
//			String element = itr.next();
//			// //
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
//		// ////// Now, display the list backwards.
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
// import java.util.ArrayList;
//
//class Collection {
//	public static void main(String args[]) {
//		// Create an array list for integers.
//		ArrayList<Integer> vals = new ArrayList<Integer>();
//		// // Add values to the array list.
//		vals.add(1);
//		vals.add(2);
//		vals.add(3);
//		vals.add(4);
//		vals.add(5);
//		// // Use for loop to display the values.
//		System.out.print("Contents of vals: ");
//		for (int v : vals)
//			System.out.print(v + " ");
//		System.out.println();
//		// // Now, sum the values by using a for loop.
//		int sum = 0;
//		for (int v : vals)
//			sum += v;
//		System.out.println("Sum of values: " + sum);
//	}
//}

// ==========================================
/*
 * The LinkedList Class The LinkedList class extends AbstractSequentialList and
 * implements the List, Deque, and Queue interfaces. It provides a linked-list
 * data structure. Java LinkedList class uses doubly linked list to store the
 * elements. It provides a linked-list data structure. It inherits the
 * AbstractList class and implements List and Deque interfaces.
 * 
 * The important points about Java LinkedList are:
 * 
 * Java LinkedList class can contain duplicate elements. Java LinkedList class
 * maintains insertion order. Java LinkedList class is non synchronized. In Java
 * LinkedList class, manipulation is fast because no shifting needs to be
 * occurred. Java LinkedList class can be used as list, stack or queue.
 */

// Demonstrate LinkedList.
//import java.util.LinkedList;
//
////
//class Collections {
//	public static void main(String args[]) {
//		// Create a linked list.
//		LinkedList<String> ll = new LinkedList<String>();
//		// Add elements to the linked list.
//		ll.add("F");
//		ll.add("B");
//		ll.add("D");
//		ll.add("E");
//		ll.add("C");
//		ll.addLast("Z");
//		ll.addFirst("A");
//		ll.add(1, "A2");
//		System.out.println("Original contents of ll: " + ll);
//		//// Remove elements from the linked list.
//		ll.remove("F");
//		ll.remove(2);
//		System.out.println("Contents of ll after deletion: " + ll);
//		//// Remove first and last elements.
//		ll.removeFirst();
//		ll.removeLast();
//		System.out.println("ll after deleting first and last: " + ll);
//		//// Get and set a value.
//	}
//}

// =============================
/*
 * Java HashSet class is used to create a collection that uses a hash table for
 * storage. It inherits the AbstractSet class and implements Set interface.
 * 
 * The important points about Java HashSet class are:
 * 
 * HashSet stores the elements by using a mechanism called hashing. HashSet
 * contains unique elements only. Difference between List and Set List can
 * contain duplicate elements whereas Set contains unique elements only.
 */

// Demonstrate HashSet.
//import java.util.HashSet;
//
////
//class Collections {
//	public static void main(String args[]) {
//		// // Create a hash set.
//		HashSet<String> hs = new HashSet<String>();
//		// // Add elements to the hash set.
//		hs.add("Beta");
//		hs.add("Alpha");
//		hs.add("Eta");
//		hs.add("Gamma");
//		hs.add("Epsilon");
//		hs.add("Omega");
//		System.out.println(hs);
//	}
//}
// =================================
// Hashmap
/*
 * The important points about Java HashMap class are:
 * 
 * A HashMap contains values based on the key. It contains only unique elements.
 * It may have one null key and multiple null values. It maintains no order.
 */

import java.util.HashMap;
import java.util.Map;

//
class Collections {
	public static void main(String args[]) {
		// Create a hash map.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

// public class HashMapExample {
// public static void main(String args[]) {
// // create and populate hash map
// HashMap<Integer, String> map = new HashMap<Integer, String>();
// map.put(101,"Let us C");
// map.put(102, "Operating System");
// map.put(103, "Data Communication and Networking");
// System.out.println("Values before remove: "+ map);
// // Remove value for key 102
// map.remove(102);
// System.out.println("Values after remove: "+ map);
// }
// }
//

// Java Collections Interfaces
// Collection Interface
// Iterator Interface
// Set Interface
// List Interface
// Queue Interface
// Dequeue Interface
// Map Interface
// ListIterator Interface
// SortedSet Interface
// SortedMap Interface

// Java Collections Classes
// HashSet Class
// TreeSet Class
// ArrayList Class
// LinkedList Class
// HashMap Class
// TreeMap Class
// PriorityQueue Class

// Collection Ordering Random Access Key-Value Duplicate Elements Null Element
// Thread Safety
// ArrayList Yes Yes No Yes Yes No
// LinkedList Yes No No Yes Yes No
// HashSet No No No No Yes No
// TreeSet Yes No No No No No
// HashMap No Yes Yes No Yes No
// TreeMap Yes Yes Yes No No No
// Vector Yes Yes No Yes Yes Yes
// Hashtable No Yes Yes No No Yes
// Properties No Yes Yes No No Yes
// Stack Yes No No Yes Yes Yes
// CopyOnWriteArrayList Yes Yes No Yes Yes Yes
// ConcurrentHashMap No Yes Yes No No Yes
// CopyOnWriteArraySet No No No No Yes Yes