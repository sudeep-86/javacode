package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class anagramString {

	public static void main(String[] args) {
		anagramString obj=new anagramString();
		obj.anagramString();

	}
	
	public void anagramString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1=scan.nextLine();
		str1=str1.toLowerCase();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter String 2: ");
		String str2=scan1.nextLine();
		str2=str2.toLowerCase();
		char[] str11=str1.toCharArray();
		char[] str12 = str2.toCharArray();
		boolean flag=false;
		if(str1.length()!=str2.length())
		{
			System.out.println("String is not anagram");
		}
		else if(str1.length()==str2.length())
		{
			Arrays.sort(str11);
			Arrays.sort(str12);
			if(Arrays.equals(str11, str12)==true)
					{
				System.out.println("String is anagram");
					}
					else
					{
						System.out.println("String is not anagram");

					}	
				}
				
			}

}
