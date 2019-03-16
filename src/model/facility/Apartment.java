package model.facility;

/*import helloPackage.Main;
import helloPackage.Requests;*/

import model.facilityMaintenance.Requests;
import view.Main;

import java.util.ArrayList;
import java.util.List;

//Changed public to abstract
public class Apartment {//was 'extends Apartment'

    private Main mainOne;


    public void setMainOne(Main mainOne){
        this.mainOne = mainOne;
    }

    private String roomFloor;
    private String roomType;
    private String roomNumber;
    private String roomPrice;
    private String rq;
    private String request;

    public Apartment(){}

    public void roomStudio(){
        mainOne.roomStudio(getRoomPrice());
    }

    public String getRoomFloor(){
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor){
        this.roomFloor = roomFloor;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getRoomPrice(){
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice){
        this.roomPrice = roomPrice;
    }
    public void setRequest(String rq){
        this.rq = rq;

    }
    public String getRequest(String rq){
        return rq;

    }
    //for future extensions or implementations
    private List<Requests> orders = new ArrayList<>();

    //for future extensions or implementations
    public List<Requests> getOrders() {
        return orders;
    }
    //for future extensions or implementations
    public void setOrders(List<Requests> orders) {
        this.orders = orders;
    }



    }

