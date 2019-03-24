package model.facility;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication



public class Studio implements RoomType {//was implements RoomInfoInterface
						//was implemets RoomType

		@Override
		public void getRent() {
		int studioRent;
		studioRent = 1100;
		System.out.println("rent is $" + studioRent + " per month");
	}

	@Override
	public void getAvailableUnits() {
		int availableUnits;
		availableUnits = 8;
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
			System.out.println("We have a studio apartment available on floor " + availableFloors);
		}
		else {
			System.out.println("We have studio apartments available on floors " + availableFloors);	
		}
	}

	@Override
	public void getMoveInDates() {
		String moveInMonths;
		moveInMonths = "April, May, or June";
		System.out.println("You can move into studio in " + moveInMonths);
	}

	@Override
	public void getAllRoomInfo() {
		getRent();
		getAvailableUnits();
		getAvailableFloors();
		getMoveInDates();
	}
	
	public static void studioAmenities() {
        boolean garageParking = false;
        boolean permitParking = false;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        System.out.print("Covered garage parking: ");
        if(garageParking == false)
        	{
            	System.out.println("no");
        	}
        System.out.print("Permit Parking: ");
        if(permitParking == false)
        	{
            	System.out.println("no");
        	}
        System.out.println("Pool and Gym access: Yes");
	}

	@Override
	public void roomStudio(String roomPrice) {

	}

	@Override
	public void roomOne(String roomPrice) {

	}

	@Override
	public void roomTwo(String roomPrice) {

	}

	@Override
	public void roomThree(String roomPrice) {

	}

	@Override
	public void getRequest(String rq) {

	}

	@Override
	public void setRequest(String request) {

	}
}
