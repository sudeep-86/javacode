package corejava;

import java.util.Hashtable;

public class hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

		ht.put(0, "Hello");
		ht.put(1, "Good Bye");
		ht.put(2, "good Morning");
		ht.put(3, "evening");

		System.out.println(ht.get(2));
		ht.remove(2);
		System.out.println(ht.get(2));

	}

}
