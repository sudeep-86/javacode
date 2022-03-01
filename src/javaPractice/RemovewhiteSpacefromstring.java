package javaPractice;

import java.util.Scanner;

public class RemovewhiteSpacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemovewhiteSpacefromstring obj= new RemovewhiteSpacefromstring();
		System.out.println(obj.replaceWhiteSpace());

	}
	
	public String replaceWhiteSpace() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			str=str.replaceAll("\\s+", "");
				
		}
	return str;
	}
	

}
