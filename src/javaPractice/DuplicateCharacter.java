package javaPractice;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateCharacter obj = new DuplicateCharacter();
		obj.duplicateCharacter();
	}
	
	public void duplicateCharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= scan.nextLine();
		int count=1;
		char[] charstr = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(charstr[i]==charstr[j] && charstr[i]!=' ' && charstr[i]!='0')
				{
					count++;
					charstr[j]='0';
				}
			}
		
		if(count>1 && charstr[i]!='0')
		{
			System.out.println(charstr[i]);
		}
		}
		
	}

}
