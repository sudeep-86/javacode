package javaPractice;

import java.util.Scanner;

public class SmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestWord obj = new SmallestWord();
		obj.smallestWord();
	}

	public void smallestWord() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		String[] words = new String[100];
		int len=0;
		String word=" ";
		String smallword =" ";
		String largeword=" ";
		str=str+ " ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word = word+str.charAt(i);
			}
			else {
				words[len]=word;
				len=len+1;
				word="";
			}
		}
		smallword=largeword=words[0];
		for(int i=0;i<len;i++)
		{
			if(smallword.length()>words[i].length()) {
				smallword=words[i];
			}
			if(largeword.length()<words[i].length()) {
				largeword=words[i];
			}
		}
		System.out.println("Smalles word: "+smallword);
		System.out.println("Smalles word: "+largeword);				
	}
}
