package javaPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NumberOfWordsInGivenTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("doc.txt");
		BufferedReader br = new BufferedReader(file);
		ArrayList<String> words = new ArrayList<String>();
		int count;
		String line,word="";
		while((line=br.readLine())!=null)
				{
			String[] str = line.toLowerCase().split("([,.\\s+)");
			for(String s:str) {
				words.add(s);
			}
			for(int i=0;i<words.size();i++)
			{
				count=1;
				for(int j=i+1;j<words.size();j++)
				{
					if(words.get(i).equals(words.get(j)))
							{
						count++;
							}
				}
				System.out.println("Word: " + words.get(i) +"count: "+count);
			}
			
				}
		

	}

}
