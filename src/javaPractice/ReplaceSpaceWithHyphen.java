package javaPractice;

import java.util.Scanner;

public class ReplaceSpaceWithHyphen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceSpaceWithHyphen obj = new ReplaceSpaceWithHyphen();
		System.out.println(obj.replaceSpaceWithHyphen());

	}
	
	public String replaceSpaceWithHyphen() {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str = scan.nextLine();
	
		str=str.replace(' ' ,'-');
		return str;
	}

}
