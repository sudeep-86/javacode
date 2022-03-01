package corejava;
public class ChildEmirates extends  AbstractparentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates ce = new ChildEmirates();
		ce.bodyColor();
		ce.engine();
		ce.safeGuidelines();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("follow the colour");
		
	}

}
