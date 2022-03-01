package corejava;

public class subsetofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Fun";
		int len= str.length();
		int temp=0;
		int comb = (len*(len+1))/2;
		String[] strnew = new String[comb+5];
		int count=0;
		for(int i=0;i<len;i=i+1) {
for(int j=i;j<len;j++) {
	
String part=str.substring(i, j+1);
strnew[temp]=part;
temp=temp+1;
}			

		}
		
		for(int i=0;i<comb;i++)
		{
			System.out.println(strnew[i]);
		}

	}

}
