package corejava;
public class MultiDimensionalArrayInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[0][1]=4;
		a[0][2]=7;
		

		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		} */

			int b[][] = {{2,4,5},{3,0,7},{6,2,5}};
			int small=b[0][0];
			for(int i =0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					if(b[i][j]<small)
					{
						small = b[i][j];
					}
				}

			}
System.out.println("Smallest Number in Multi Dimensional array is " + small);
	

	int a[][] = {{2,4,5},{3,0,7},{6,2,5}};
	int largest=a[0][0];
	for(int i =0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]>largest)
			{
				largest = a[i][j];
			}
		}

	}
System.out.println("Largest Number in Multi Dimensional array is " + largest);

int c[][] = {{2,4,5},{3,0,7},{6,9,6}};
int smallest=a[0][0];
int large=0;
int col=0;
for(int i =0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++)
	{
		if(c[i][j]<smallest)
		{
			smallest = c[i][j];
			col=j;
		}
	}

}


System.out.println("Smallest Number in Multi Dimensional array is " + small);
for(int i =0;i<c.length;i++)
{
	if(c[i][col]>large)
		{
			large = c[i][col];
		}
	}
	
System.out.println("Largest Number in Smallest Number Column " + col +" is " + large);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
