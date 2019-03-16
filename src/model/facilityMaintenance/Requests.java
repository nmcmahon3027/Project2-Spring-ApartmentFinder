package model.facilityMaintenance;

import java.util.ArrayList;
import java.util.List;

public class Requests {
    //Requests is a feature that can be implemented later as an add-on

    private List<RequestsDetail> orderDetails = new ArrayList<RequestsDetail>();

    public Requests(){}

    public List<RequestsDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<RequestsDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }




    }



