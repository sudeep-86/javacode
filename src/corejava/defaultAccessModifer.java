package corejava;

public class defaultAccessModifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDemo ad = new ArrayDemo();
		ad.pub=4;
		ad.def=5;
	//	ad.pri; privte variable
		privateAccessModifier pam = new privateAccessModifier();
//		pam.privateMethod();//cannot access as this method is private
	}
	
	void defaultMethod()
	{
		System.out.println("I am inside default specifier "
				+ "and being used in Demo1 class of demopack");
	}

}
