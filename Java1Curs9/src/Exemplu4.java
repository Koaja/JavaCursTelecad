import java.util.ArrayList;

public class Exemplu4 {

	public static void main(String[] args) {
		/*
		 * Collections
		 * 
		 * List - interfata ArrayList<E> - clasa LinkedList<E> - clasa Vector<E>
		 * - clasa
		 * 
		 * Set - interfata HashSet<E> - clasa LinkedHashSet<E> - clasa
		 * TreeSet<E> - clasa
		 * 
		 * Map - interfata HashMap<E, V> - clasa LinkedHashMap<E, V> - clasa
		 * TreeMap<E, V> - clasa
		 */

		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(23);
		al.add(2333);
		al.add(5);
		al.add(4);
		al.add(10);
		al.add(4);

		al.remove(4); // removes index 4
		al.remove(new Integer(4)); // removes value 4 from array
		for (Integer elem : al) {
			System.out.println(elem);
		}

	}
}
