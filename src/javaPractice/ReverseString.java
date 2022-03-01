package javaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj= new ReverseString();
		System.out.println(obj.reverseString());
	}

	public String reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= scan.nextLine();
		String revstr=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr= revstr+str.charAt(i);
		}
		return revstr;
		
	}
}
