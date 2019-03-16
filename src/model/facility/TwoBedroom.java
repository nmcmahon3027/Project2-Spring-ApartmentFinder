package model.facility;

public class TwoBedroom implements RoomInfoInterface {

	@Override
	public void getRent() {
		int twoBedRent;
		twoBedRent = 1600;//dev note: changed from 1700(typo?)
		System.out.println("rent is $" + twoBedRent + " per month");	
	}

	@Override
	public void getAvailableUnits() {
		int availableUnits;
		availableUnits = 18;//was 1
		if(availableUnits == 1) 
			{
				System.out.println("there is only " + availableUnits + " two bedroom unit available");
			}
		else {
				System.out.println("there are " + availableUnits + " two bedroom units available");
			}
	}

	@Override
	public void getAvailableFloors() {
		String availableFloors;
		availableFloors = "1, 4, and 5";//was 3 and 4
		if(availableFloors.equals("1")) 
		{
			System.out.println("We have a two bedroom apartment available on floor " + availableFloors);
		}
		else {
			System.out.println("We have two bedroom apartments available on floors " + availableFloors);	
		}
	}

	@Override
	public void getMoveInDates() {
		String moveInMonths;
		moveInMonths = "April, June, July or August";
		System.out.println("You can move into a two bedroom apartment in " + moveInMonths);
	}

	@Override
	public void getAllRoomInfo() {
		getRent();
		getAvailableUnits();
		getAvailableFloors();
		getMoveInDates();
	}
	
	private static void twoBedAmenities() {
        boolean garageParking = true;
        boolean permitParking = true;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        System.out.print("Covered garage parking: ");
        if(garageParking == true)
        	{
            	System.out.println("yes");
        	}
        System.out.print("Permit Parking: ");
        if(permitParking == true)
        	{
            	System.out.println("yes");
        	}
        System.out.println("Pool and Gym access: Yes");

    }
	
}
