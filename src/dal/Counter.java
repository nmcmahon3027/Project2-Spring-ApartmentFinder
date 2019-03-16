package dal;

import model.facility.TwoBedroom;

public class Counter extends TwoBedroom {

        //this class will hold the number of available units for each apartment

    public int bedThree;
    public int bedOne;
    public int bedS;
    public int bedTwo;
    public int permitParking;


    public Counter(){
        //Creates and counts the available apartment units that remain
        bedThree = 6;
        bedOne = 10;
        bedS = 8;
        bedTwo = 18;
        permitParking = 5;

    }
    public Counter(int init){
        bedOne = init;
        bedThree = init;
        bedS = init;
        bedTwo = init;
        permitParking = init;
    }
    public int getValue(){
        return bedOne;

    }
    public void decrement(){
        bedThree--;
        bedOne --;
        bedS--;
        bedTwo--;
        permitParking --;

    }
    public String toString(){
        return "" + bedOne;
    }



    }

