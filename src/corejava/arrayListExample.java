package corejava;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> a = new ArrayList<String>();
a.add("Sudeep");
a.add("Java");
a.add(1, "Student");
System.out.println(a);
//a.remove(1);
//a.remove("Java");
System.out.println(a.get(2));
//System.out.println(a);
System.out.println(a.contains("Testing"));
System.out.println(a.contains("Student"));
System.out.println(a.indexOf("Testing"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
