package corejava;

import java.util.Scanner;

public class countPunctuationCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPunctuationCharacters obj= new countPunctuationCharacters();
		System.out.println(obj.punctuation());
	}
	
	public int punctuation() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String newString = scan.nextLine();
		int len = newString.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(newString.charAt(i)=='\''||newString.charAt(i)=='+'
					||newString.charAt(i)=='!'||newString.charAt(i)=='\"'
					||newString.charAt(i)=='.'||newString.charAt(i)==';'
					||newString.charAt(i)=='-'||newString.charAt(i)=='?')
			{
				count++;
			}
			
		}
		return count;
		
	}

}
