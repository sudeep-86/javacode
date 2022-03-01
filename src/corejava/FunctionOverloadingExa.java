package corejava;
public class FunctionOverloadingExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverloadingExa f = new FunctionOverloadingExa();
		f.getData(10);
		f.getData("hello");
		f.getData(12, 14);
	}
	
	public void getData(int a)
	{
		System.out.println("I have an integer " + a );
	}
	
	public void getData(String a)
	{
		System.out.println("I have a string " + a );
	}
	
	public void getData(int a, int b)
	{
		System.out.println("I have integers " + a +" " + b );
	}


	
}
