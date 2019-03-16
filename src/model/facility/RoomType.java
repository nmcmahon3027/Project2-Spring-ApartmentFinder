package model.facility;

public interface RoomType extends RoomInfoInterface {

    void roomStudio(String roomPrice);
    void roomOne(String roomPrice);
    void roomTwo(String roomPrice);
    void roomThree(String roomPrice);
    void getRequest(String rq);
    void setRequest(String request);



}
