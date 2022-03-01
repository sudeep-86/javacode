package javaPractice;

import java.util.Scanner;

public class Subsetofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsetofstring  obj= new Subsetofstring();
		String[] arr=obj.stringSubset();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public String[] stringSubset() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=scan.nextLine();
		int len=str.length();
		int num= len*(len+1)/2;
		int count=0;
		String[] arr= new String[num];
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				arr[count]=str.substring(i, j+1);
				count++;
			}
		}
	return arr;
	}

}
