package corejava;
public class superChildDemo extends superParentDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superChildDemo cd = new superChildDemo();
		cd.getStringData();
		cd.getData();
//			superParentDemo spd = new superChildDemo();// calls child class method
//		spd.getData();
//		
	
	}
	
	public superChildDemo()
	{
		super();// calls parent class constructor
		System.out.println("child class constructor");
	}
	String name ="QAClickAcademy";
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData() {
super.getData();
		System.out.println("I am child classs");
	}
}
