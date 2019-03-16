package model.facility;


public class ThreeBedroom implements RoomInfoInterface{



    @Override
    public void getRent() {
        int threeBedRent;
        threeBedRent = 1900;
        System.out.println("rent is $" + threeBedRent + " per month");
    }

    @Override
    public void getAvailableUnits() {
        int availableUnits;
        availableUnits = 6;
        if(availableUnits == 1)
        {
            System.out.println("there is only " + availableUnits + " three bedroom unit available");
        }
        else {
            System.out.println("there are " + availableUnits + " three bedroom units available");
        }
    }

    @Override
    public void getAvailableFloors() {
        String availableFloors;
        availableFloors = "2, 3 and 5";
        if(availableFloors.equals("1"))
        {
            System.out.println("We have a three bedroom apartment available on floor " + availableFloors);
        }
        else {
            System.out.println("We have three bedroom apartments available on floors " + availableFloors);
        }
    }

    @Override
    public void getMoveInDates() {
        String moveInMonths;
        moveInMonths = "May, August, and September";
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


