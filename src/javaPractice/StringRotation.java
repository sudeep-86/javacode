package javaPractice;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRotation obj= new StringRotation();
		boolean flag= obj.StringRotation();
		if(flag==true) {
			System.out.println("String is rotation");
		}
		else {
			System.out.println("String is not rotation");
		}
	}
	
	public boolean StringRotation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1= scan.nextLine();
		System.out.println("Enter String2: ");
		String str2 =scan.nextLine();
		boolean flag=false;
		String concat= str1+str1;
		if(concat.contains(str2)) {
		flag=true;	
		}
		return flag;
	}


}
