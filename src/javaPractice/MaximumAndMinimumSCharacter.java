package javaPractice;

import java.util.Scanner;

public class MaximumAndMinimumSCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumAndMinimumSCharacter obj= new MaximumAndMinimumSCharacter();
		obj.maximumAndMinimumSCharacter();
	}
	public void maximumAndMinimumSCharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= scan.nextLine();
		char charmax=str.charAt(0);
		char charmin=str.charAt(0);
		int[] freq = new int[str.length()];
		int min,max;
		char[] charstr= str.toCharArray();
		for(int i=0;i<charstr.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<charstr.length;j++)
			{
				if(charstr[i]==charstr[j] &&charstr[i]!=' ' &&charstr[i]!='0')
				{
					freq[i]++;
					charstr[j]='0';
				}
			}
			
		}
		min =max=freq[0];
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i] && freq[i]!='0') {
				min=freq[i];
				charmin=charstr[i];
			}
			
			if(max<freq[i] && freq[i]!='0') {
				max=freq[i];
				charmax=charstr[i];
			}
		}
		System.out.println("Minimum occuring character:" + charmin);
		System.out.println("Maximum occuring character:" + charmax);
	}

}
