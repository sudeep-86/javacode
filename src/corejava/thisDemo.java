package corejava;
public class thisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo dd = new thisDemo();
		dd.getData();
		
	}

	int a=2;
	
	public void getData() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(a+this.a);
	}
}
