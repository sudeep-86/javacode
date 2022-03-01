package javaPractice;

import java.util.Scanner;

public class DuplicateWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateWordInString obj = new DuplicateWordInString();
		obj.duplicateWordInString();
	}
	
	public void duplicateWordInString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
	str=str.toLowerCase();
	String[] word = str.split(" ");
	for(int i=0;i<word.length;i++) {
		int count =1;
		for(int j=i+1;j<word.length;j++)
		{
			if(word[i].equals(word[j]))
			{
				count++;
				word[j]="0";
			}
		}
		if(count>1 && word[i]!="0")
		{
			System.out.println("Duplicate world is: "+ word[i]+" and it comes " + count +" times in a string");
		}
	}
	}

}
