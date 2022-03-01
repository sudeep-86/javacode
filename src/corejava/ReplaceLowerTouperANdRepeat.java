package corejava;

public class ReplaceLowerTouperANdRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a Dog";
		int len=str.length();
		StringBuffer newstr = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversion: " + newstr);
	}

}

