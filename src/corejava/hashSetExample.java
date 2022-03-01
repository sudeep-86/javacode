package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashSet, treeSet, LinkedhashSet --implements Set interface

		HashSet<String> h = new HashSet<String>();
		h.add("USA");
		h.add("UK");
		h.add("India");
		h.add("UK");
		h.add("Canada");
		h.add("Germany");
		h.add("Spain");
		h.add("Italy");
		System.out.println(h);
		//h.remove("UK");
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h);
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
