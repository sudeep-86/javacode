package corejava;
public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1234
 * 567
 * 89
 * 10		
 */	
//		int k=1;
//		for(int i=0;i<=3;i++)
//		{
//			for(int j=4-i;j>=1;j--)
//			{
//				System.out.print(" "+k);
//			
//				k++;
//			}
//			System.out.println();
//			
//		}
		
		int l=1;
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" "+l);
			
				l++;
			}
		//	System.out.println();
			
		}

	}

}

