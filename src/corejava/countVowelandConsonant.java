package corejava;

import java.util.Scanner;

public class countVowelandConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countVowelandConsonant obj = new countVowelandConsonant();
		int[] count =obj.returnVowelandConsonantCount();
		System.out.println("Vowel Count is: " + count[0]);
		System.out.println("Consonant Count is: " + count[1]);
	}
	
	public int[] returnVowelandConsonantCount() {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String newString = scan.nextLine();
	int[] count= new int[2];
	int len=newString.length();
	
	for(int i=0;i<len;i++)
	{
		if(newString.charAt(i)=='A'||newString.charAt(i)=='a'
				||newString.charAt(i)=='E'||newString.charAt(i)=='e'
				||newString.charAt(i)=='I'||newString.charAt(i)=='i'
				||newString.charAt(i)=='O'||newString.charAt(i)=='o'
				||newString.charAt(i)=='U'||newString.charAt(i)=='u')
		{
			count[0]++;
		}
		else if(newString.charAt(i)!=' ') {
			count[1]++;
		}
	}
	return count;
	}

}
