package corejava;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[5];

//		int b[] = new int[6];//declares array and allocates memory for the array
		a[0]=2;
		a[1]=5;
		a[2]=67;
		a[3]=34;
		a[4]=3;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
		int b[] = {3,5,74,4,6};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
public	int pub =9;
int def=9;
private int pri;


}
