package corejava;

public class Stringrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String str1 = "abcde";
		String str2 = "deabc";
		String strcon = str1 + str1;
		System.out.println(strcon);
		int len = str2.length();
		for(int i=0;i<strcon.length()-len ;i++)
		{
			if(strcon.substring(i, (i+len)).equals(str2))
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("String: "+str2 +" is a rotation of " + str1);
		}
		else
		{
			System.out.println("String: "+str2 +" is not a rotation of " + str1);
		}

	}

}
