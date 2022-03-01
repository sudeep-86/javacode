package javaPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeString obj = new PalindromeString();
		boolean flag=obj.palindromeString();
		if(flag==true)
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not Palindrome");
		}
	}

	public boolean palindromeString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		boolean flag= false;
		String str=scan.nextLine();
		int len = str.length();
		str= str.toLowerCase();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)==str.charAt(len-i-1))
			{
			flag=true;	
			}
			else {
				flag= false;
				break;
			}
		}
		return flag;
	}
}
