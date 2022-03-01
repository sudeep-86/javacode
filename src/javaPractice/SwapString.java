package javaPractice;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapString obj = new SwapString();
		obj.swapString();
	}
	
	public void swapString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1 :");
		String str1 = scan.nextLine();
		System.out.println("Enter String2 :");
		String str2 = scan.nextLine();
		str1= str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length(),str1.length());
		System.out.println("String 1 " + str1);
		System.out.println("String 2 " + str2);
	}

}
