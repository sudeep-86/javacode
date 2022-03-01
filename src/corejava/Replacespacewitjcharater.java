package corejava;

public class Replacespacewitjcharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="This is a Dog";
		str = str.replaceAll("\\s", "+");
		System.out.println(str);
	}

}
