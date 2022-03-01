package javaPractice;

import java.util.Scanner;

public class FreqOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqOfCharacter obj = new FreqOfCharacter();
		obj.freqOfCharacter();
	}
	
	public void freqOfCharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str= scan.nextLine();
		str= str.toLowerCase();
		char[] charstr=str.toCharArray();
		int[] freq = new int[charstr.length];
		
		for(int i=0;i<charstr.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<charstr.length;j++)
			{
				if(charstr[i]==charstr[j] && charstr[i]!=' ' && charstr[i]!='0')
				{
					freq[i]++;
					charstr[j]='0';
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(charstr[i]!=' ' && charstr[i]!='0')
			{
				System.out.println("Charater "+ charstr[i] +" and it occurs "+ freq[i] +" times");	
			}
			
		}
	}

}
