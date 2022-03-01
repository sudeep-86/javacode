package demopack;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Text");
		String str = scan.nextLine();
		int len= stringlength(str);
		System.out.println("String length: " + len);
		
	}
	public static int stringlength(String str) {
		int count =0;
		char[] str1 = str.toCharArray();
	    int len = str.length();
	    for(int i=0;i<len;i++)
	    {
	    	if(str1[i]!=' ')
	    	{
	    		count++;
	    	}
	    }
		return count;
		
		
	}

}
