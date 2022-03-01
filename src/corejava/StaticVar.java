package corejava;
public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj = new StaticVar("Bob","Marthalli");
		StaticVar obj1 = new StaticVar("Ram","Jayanagar");
		StaticVar obj2 = new StaticVar("Sham","Vaddnagar");
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
	}
	
	String name;//instance variables
	String address;
	static String city;// ="Bangalore";// class variable
	static int i;//=0;
	static {
		city="Bangalore";
		i=0;
	}
	
	public StaticVar(String name, String address) {
		this.name =name;
		this.address= address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+ " " + city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

}
