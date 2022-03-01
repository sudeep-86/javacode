package javaPractice;

import java.util.Scanner;

public class PermutationofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void permuation() {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter String: ");	
	    String str = scan.nextLine();
	    int len= str.length();
	    int count=1;
	    String part;
	    for(int i=len;i>=1;i--)
	    {
	    count=count*i;	
	    }
	    char[] arr=str.toCharArray();
	    String[] combarr= new String[count];
	    for(int i=0;i<count;i++) {
	    	part= str.replace(oldChar, newChar)
	    }
	}

    

}
