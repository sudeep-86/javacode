package javaPractice;

import java.util.Scanner;

public class Replacelowertoupperandviceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Replacelowertoupperandviceversa obj = new Replacelowertoupperandviceversa();
		System.out.println(obj.replaceCharacter());

	}
	
	public String replaceCharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= scan.nextLine();
		int len=str.length();
		StringBuffer str1= new StringBuffer();
		for(int i=0;i<len;i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		return str;
	}

}
