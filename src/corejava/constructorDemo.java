package corejava;
public class constructorDemo {
	
	public constructorDemo() {
		System.out.println(" i am in the constructor");
	}
	public constructorDemo(int a, int b) {
		System.out.println(" i am in the constructor and have values "+ a+" , "+b);
		System.out.println(a+b);
	}
	public constructorDemo(String ab) {
		System.out.println(" i am in the constructor and have value "+ ab);
	}
	
	public void getData()
	{
		System.out.println("i am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	constructorDemo cons = new constructorDemo();
	constructorDemo cons1 = new constructorDemo(4,6);
	constructorDemo cons2 = new constructorDemo("hello");
	
	
	}

}
