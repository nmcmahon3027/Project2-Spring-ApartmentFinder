package view;

import dal.RoomInfoInterface;

public class OneBedroom extends Main implements RoomInfoInterface {

	@Override
	public void getRent() {
		int OneBedRent;
		OneBedRent = 1400;
		System.out.println("rent is $" + OneBedRent + " per month");	
	}

	@Override
	public void getAvailableUnits() {
		int availableUnits;
		availableUnits = 3;
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
		availableFloors = "1, 2, 3, and 4";
		if(availableFloors.equals("1")) 
		{
			System.out.println("We have a one bedroom apartment available on floor " + availableFloors);
		}
		else {
			System.out.println("We have one bedroom apartments available on floors " + availableFloors);	
		}	
	}

	@Override
	public void getMoveInDates() {
		String moveInMonths;
		moveInMonths = "May, August, or September";
		System.out.println("You can move into a one bedroom apartment in " + moveInMonths);
		
	}

	@Override
	public void getAllRoomInfo() {
		getRent();
		getAvailableUnits();
		getAvailableFloors();
		getMoveInDates();
	}
	
	private static void oneBedAmenities() {
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
