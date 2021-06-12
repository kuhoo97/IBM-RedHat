package comm.example;

public class SuperMan extends Airplane implements Sailer{

	public void dock() {
		System.out.println("Allow Superman To Dock in the harbour");
		
	}

	@Override
	public double calcTripDistance(double startPoint, double endPoint) {
		// TODO Auto-generated method stub
		return super.calcTripDistance(startPoint, endPoint);
	}

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Superman takeoff");
	}

	@Override
	public void land() {
		System.out.println("Superman Landed.");
		
	}

	@Override
	public void fly() {
		System.out.println("Superman Flying.");
		
	}
}
	