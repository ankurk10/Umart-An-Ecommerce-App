package com.example.umart3;

public class MyOrdersModel {

    private int productImage;
    private String productTitle;
    private String productDeliveryStatus;
    private String productReturnStatus;

    public MyOrdersModel(int productImage, String productTitle, String productDeliveryStatus, String productReturnStatus) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productDeliveryStatus = productDeliveryStatus;
        this.productReturnStatus = productReturnStatus;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductDeliveryStatus() {
        return productDeliveryStatus;
    }

    public String getProductReturnStatus() {
        return productReturnStatus;
    }
}
