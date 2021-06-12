package comm.example;

public class Harbour {

	public static void main(String[] args) {
		Harbour bostonHarbour=new Harbour();
		RiverBarge riverBarge=new RiverBarge();
		System.out.println("Trip distance:"+riverBarge.calcTripDistance(100.0, 200.0));
		System.out.println("Fuel efficiency: "+riverBarge.calcFuelEfficiency(400));
		bostonHarbour.givePermissionToDock(riverBarge);
		SeaPlane seaPlane=new SeaPlane();
		seaPlane.takeoff();
		seaPlane.fly();
		seaPlane.land();
		System.out.println("Trip Distance: "+seaPlane.calcTripDistance(100, 1900));
		System.out.println("Fuel efficiency: "+seaPlane.calcFuelEfficiency(900));
		bostonHarbour.givePermissionToDock(seaPlane);
		SuperMan superMan=new SuperMan();
		superMan.takeoff();
		superMan.fly();
		superMan.land();
		System.out.println("Trip distance:"+superMan.calcTripDistance(100, 900));
		bostonHarbour.givePermissionToDock(superMan);

	}
	
	
	private void givePermissionToDock(Sailer s)
	{
		s.dock();
	}
	
}
