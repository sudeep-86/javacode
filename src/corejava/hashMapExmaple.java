package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Good Bye");
		hm.put(2, "good Morning");
		hm.put(3, "evening");
		hm.put(4, null);
		hm.put(null,"night");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		Set as =hm.entrySet();
		Iterator it= as.iterator();
		while(it.hasNext()) {
			Map.Entry em = (Map.Entry)it.next();
			System.out.println(em.getKey());
			System.out.println(em.getValue());
		//	System.out.println(it.next());

		}
		}

}
