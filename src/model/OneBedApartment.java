package model;

import model.facility.RoomType;
import model.facilityMaintenance.Requests;

public class OneBedApartment implements RoomType {


    @Override
    public void roomStudio(String roomPrice) {
        System.out.println("The average price of a studio is " + roomPrice);

    }

    @Override
    public void roomOne(String roomPrice) {
        System.out.println("The price of a one bedroom is " + roomPrice);

    }

    @Override
    public void roomTwo(String roomPrice) {
        System.out.println("The average price of a TWO bedroom is " + roomPrice);

    }

    @Override
    public void roomThree(String roomPrice) {
        System.out.println("The average price of a three bedroom is " + roomPrice);

    }

    public void getRequest(String rq) {
        System.out.println("Thank you! Your request has been sent \n" +
                "A crew member will contact you shortly " );
    }

    public void setRequest(String rq) {
        System.out.println("You entered apartment " + rq);
        checkFloor(rq);

    }
    //checks user's apartment number to return the floor it is on
    public void checkFloor(String rq){
        if(rq.startsWith("1")){
            System.out.println("LEVEL 1 resident");
        }
        if(rq.startsWith("2")){
            System.out.println("LEVEL 2 resident");
        }
        if(rq.startsWith("3")){
            System.out.println("LEVEL 3 resident");
        }
        if(rq.startsWith("4")){
            System.out.println("LEVEL 4 resident");
        }
        if( rq.startsWith("5")){
            System.out.println("LEVEL 5 resident");
            //below is for testing purposes and future additional possibilities
            Requests reqFive = new Requests();
            reqFive.getOrderDetails();

        }


    }

    @Override
    public void getRent() {

    }

    @Override
    public void getAvailableUnits() {

    }

    @Override
    public void getAvailableFloors() {

    }

    @Override
    public void getMoveInDates() {

    }

    @Override
    public void getAllRoomInfo() {

    }
}


