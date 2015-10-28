import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally
		 * [0][1][2][3][4][5] ....
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * Linked list consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]...
		 * 	  <-   <-
		 */
		
		
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("Array List", arrayList);
		doTimings("Linked List", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();
		/*
		 * // Add items at end of list for (int i = 0; i < 1E5; i++) {
		 * list.add(i); }
		 */

		/*
		// Add items somewhere on list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i); //Adding to the beginning
		}
		*/
		
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size()-100, i); //Adding to the end
		}
		
		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);

	}
}
