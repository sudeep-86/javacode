package javaPractice;

import java.util.Scanner;

public class SeparateIndividualCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeparateIndividualCharacter obj= new SeparateIndividualCharacter();
		obj.separateIndividualCharacter();
	}
public void separateIndividualCharacter()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = scan.nextLine();
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.charAt(i));
	}
	
}
}
