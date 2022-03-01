package corejava;

public class divideStringtoNParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String  in ="abcdef";
	int n=3;
	int len =in.length();
	int temp=0;
	int chars =len/n;
	String[] equalStr= new String[n];
	if(len%n!=0)
	{
		System.out.println("string cannot be divided into equal parts");
	}
	else
	{
	

	for(int i=0;i<len;i=i+chars) {
		String part = in.substring(i,i+chars);
		equalStr[temp]=part;
		temp++;
	}

	}
	for(int i=0;i<n;i++)
	{
		System.out.println(equalStr[i]);
	}
	}
	
}
