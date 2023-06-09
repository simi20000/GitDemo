package Java;

public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates ce = new ChildEmirates();
		ce.colour();
		ce.Engine();
		ce.SafetyGuidelines();

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("color red");
		
	}

}
