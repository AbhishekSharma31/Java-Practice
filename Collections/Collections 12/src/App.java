import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		/*
		 * Consider: 1. what you need the collection to do 2. are you using the
		 * fastest collection for your purposes (think about insertion/deletion,
		 * retrieval and traversal
		 */

		// ////////////////////LIST ////////////////////////////

		// Store lists of objects
		// Duplicates are allowed
		// Objects remain in order
		// Elements are indexed via an integer
		// Ex. shopping list
		// Checking for particular item in list is slow
		// Looking an item up by index is fast
		// Iterating through lists is relatively fast
		// Note: you can sort lists if you want to.

		// If you only add or remove items at end of list, use ArrayList.
		List<String> list1 = new ArrayList<String>();

		// Adding and removing anywhere else in the list?

		List<String> list2 = new LinkedList<String>();

		// //////////////////SETS ////////////////////////////////

		// Only store unique values
		// Great for removing duplicates
		// Not indexed, unlike lists
		// Very fast o check if a particular object exists
		// If you want to use your own object, you must implement hashCode() and equals()

		// Order is unimportant and OK if it changes?
		Set<String> set1 = new HashSet<String>();

		// Sorted in natural order? Use TreeSet - must implement Comparable for custom types
		// (1,2,3......, a,b,c....etc)
		Set<String> set2 = new TreeSet<String>();

		// Elements remain in order they were added, retain position
		Set<String> set3 = new LinkedHashSet<String>();

		// ///////////////MAPS /////////////////////////////////////

		// Key Value Pairs
		// Like lookup table
		// Retrieving a value by key is fast
		// Iterating over map values is very slow
		// maps are not optimized for iteration
		// If you want to use your own objects as keys, you must implement hashCode() and equals().

		// Key not in particular order, and order liable to change
		Map<String, String> map1 = new HashMap<String, String>();

		// Key sorted in natural order
		// (1,2,3......, a,b,c....etc)
		Map<String, String> map2 = new TreeMap<String, String>();

		// Keys remain in order they were added, retain position
		Map<String, String> map3 = new LinkedHashMap<String, String>();

	}
}
