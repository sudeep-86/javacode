package javaPractice;

import java.util.Scanner;

public class ReverseStringByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringByWord obj = new ReverseStringByWord();
		obj.reverseStringByWord();

	}
	public void reverseStringByWord() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i] + " ");
		}
	}

}
