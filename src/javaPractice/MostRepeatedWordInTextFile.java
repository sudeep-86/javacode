package javaPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MostRepeatedWordInTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String line,word ="";
int count=0, maxCount=0;
ArrayList<String> words = new ArrayList<String>();
FileReader file = new FileReader("data.txt");
BufferedReader br= new BufferedReader(file);
while((line=br.readLine())!= null) {
	String[] string =line.toLowerCase().split("([,.\\s+)");
	for(String s:string) {
		words.add(s);
	}
	for(int i=0;i<words.size();i++)
	{
		count=1;
		for(int j=i+1;j<words.size();i++)
		{
			if(words.get(i).equals(words.get(j)))
			{
			count++;	
			}
		}
		if(count>maxCount) {
			maxCount=count;
			word=words.get(i);
		}
	}
	System.out.println("Most repeated word: "+word);
	br.close();
			
}
		
	}

}
