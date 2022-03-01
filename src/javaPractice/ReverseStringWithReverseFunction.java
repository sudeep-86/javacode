package javaPractice;

import java.util.Scanner;

public class ReverseStringWithReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringWithReverseFunction obj = new ReverseStringWithReverseFunction();
		obj.reverseStringWithReverseFunction();
	}
	public void reverseStringWithReverseFunction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		scan.close();
		String revstr= reverseString(str);
	}
	private String reverseString(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty())
			return str;
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
