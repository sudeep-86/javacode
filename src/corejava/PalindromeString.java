package corejava;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Kayaka";
		int temp=-1;
		int count= str.length();
		str=str.toLowerCase();
			int len = str.length()/2;
		for(int i=0,j=count;i<len;i++,j--)
		{
		
				if(str.charAt(i)!=str.charAt(str.length()-i-1))
				{
					temp=-1;
					break;
				}
				else {
					temp=0;
				}
		}
if(temp==0)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("not palindrome");
}

	}

}
