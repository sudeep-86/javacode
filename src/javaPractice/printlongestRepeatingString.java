package javaPractice;

import java.util.Scanner;

public class printlongestRepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printlongestRepeatingString obj = new printlongestRepeatingString();
		String str=obj.longestString();
		System.out.println(str);
	}
	
	public String longestString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= scan.nextLine();
		int len = str.length();
		String longStr=" ";
		str=str.toLowerCase();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				String x=lcp(str.substring(i,len),str.substring(j,len));
			}
		}
		
		return longStr;
	}

	public String lcp(String x, String y) {
		int n=Math.min(x.length(), y.length());
		for(int i=0;i<n;i++) {
			if(x.charAt(i)!=y.charAt(i)) {
				return  x.substring(0, i);
			}
		}
		return x.substring(0, n);
		
	}
}
