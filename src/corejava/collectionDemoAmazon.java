package corejava;

import java.util.ArrayList;

public class collectionDemoAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		//4-3,5-3,6-2,9-1

		//prepare empty arraylist -- pass 4 and check if 4 is already there, if not will push it into that arraylist
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
	{
		int k=0;
		if(!al.contains(a[i]))
		{
			al.add(a[i]);
			k++;
			for(int j=i+1;j<a.length;j++)
			{
				
			if(a[i]==a[j]) {
				k++;
				
			}
		}
		
			System.out.println(a[i]+ " is printed "+ k +" of times");

	}
		
	}
	}

}
