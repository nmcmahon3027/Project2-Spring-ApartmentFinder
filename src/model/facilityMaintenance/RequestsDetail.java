package model.facilityMaintenance;

public class RequestsDetail {
    //Like Requests, this can be implemented later as an add-on feature
    private Requests service;
    private int quantity;

    public RequestsDetail() {}

    public RequestsDetail(Requests product, int quantity) {
        this.service = product;
        this.quantity = quantity;
    }

    public Requests getProduct() {
        return service;
    }

    public void setProduct(Requests product) {
        this.service = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}



