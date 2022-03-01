package demopack;

import java.util.Scanner;

public class String2Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Text");
		String str = scan.nextLine();
		int len = secondStringLength(str);
		System.out.println("Length of Second String: " +len);

	}
	
	public static int secondStringLength(String str) {
		int count=0;
		String[] str1 = str.split(" ");
		char[] str2 = str1[1].toCharArray();
		int len= str2.length;
		for(int i=0;i<len;i++)
		{
			if(str2[i]!=' ') {
				count++;
			}
			else break;
		}
		
		
		
		return count;
	}

}
