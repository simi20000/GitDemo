package Java;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.GreenGo();
		a.RedStop();
		a.YellowWait();
		AustralianTraffic at = new AustralianTraffic();
		at.voidWalkOnSymbol();
		ContinentalTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();

	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("I am greengo");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("I am Redstop");
		
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("I am yellowwait");
		
	}
	
	public void voidWalkOnSymbol() {
		System.out.println("I am walkonsymbol");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("I am Train Symbol");
		
	}
	
	

}
