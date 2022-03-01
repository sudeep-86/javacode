package corejava;
public class AustralianTraffic implements CentralTrafficInterface,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTrafficInterface c = new AustralianTraffic();
		c.redStop();
		c.greenGo();
		c.flashYellow();
		
		AustralianTraffic a= new AustralianTraffic();
		a.walkonsymbol();
		ContinentalTraffic ct = new AustralianTraffic();
		ct.Trainsymbol();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implementation");
		
	}
	
	public void walkonsymbol()
	{
		System.out.println("walking on hands");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implementation");		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashing Yello Implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol");
		
	}

}
