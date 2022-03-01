package javaPractice;

import java.util.Scanner;

public class DivideStringtoNparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideStringtoNparts obj= new DivideStringtoNparts();
	obj.divideString();
		//String[] equalstr=obj.divideString();
//	for(int i=0;i<equalstr.length;i++) {
//		System.out.println(equalstr[i]);
//	}

	}
	
	public void divideString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter parts n:");
		int n=scan.nextInt();
		int len= str.length();
		int newlen=len/n;
		int count=0;
		String equalstr[]= new String[newlen];
		if(len%n!=0) {
			System.out.println("String cannot be divided into equal parts");
		}
		for(int i=0;i<len;i=i+newlen) {
			String part=
			equalstr[count]=str.substring(i, i+newlen);
			count++;
		}
		for(int i=0;i<equalstr.length;i++) {
		System.out.println(equalstr[i]);
		}
				}

}
