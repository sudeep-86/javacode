package corejava;

import java.util.Scanner;
public class MaximumandMinimumCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumandMinimumCharacter obj = new MaximumandMinimumCharacter();
		System.out.println(obj.charCount());
		
	}
	
    public int charCount(){
        Scanner scan = new Scanner(System.in);
           System.out.println("Enter String:");
           String newString = scan.nextLine();   
           int len=newString.length();
           int count=0;
           for( int i=0;i<len;i++) {
        	   if(newString.charAt(i)!=' ')
        	   {
        		   count++; 
        	   }
           }
           return count;
    }
}
