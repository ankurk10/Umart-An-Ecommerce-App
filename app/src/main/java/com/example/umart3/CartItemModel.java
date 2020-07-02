package com.example.umart3;

public class CartItemModel {

    public static final int CART_ITEM_LAYOUT = 0;
    public static final int TOTAL_AMOUNT_LAYOUT = 1;

    private int viewType;

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }


    //Cart Item Layout
    private int ImageResource;
    private String title;
    private String seller;
    private String price;
    private String cutPrice;
    private String offersApplied;
    private String deliveryTime;

    public CartItemModel(int viewType, int imageResource, String title, String seller, String price, String cutPrice, String offersApplied, String deliveryTime) {
        ImageResource = imageResource;
        this.title = title;
        this.seller = seller;
        this.price = price;
        this.cutPrice = cutPrice;
        this.offersApplied = offersApplied;
        this.deliveryTime = deliveryTime;
        this.viewType = viewType;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public void setImageResource(int imageResource) {
        ImageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCutPrice() {
        return cutPrice;
    }

    public void setCutPrice(String cutPrice) {
        this.cutPrice = cutPrice;
    }

    public String getOffersApplied() {
        return offersApplied;
    }

    public void setOffersApplied(String offersApplied) {
        this.offersApplied = offersApplied;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    //Cart Item Layout


    // Cart Total Amount Layout
    private String totalItems;
    private String totalItemsPrice;
    private String deliveryFee;
    private String totalPrice;
    private String savedAmount;

    public CartItemModel(int viewType, String totalItems, String totalItemsPrice, String deliveryFee, String totalPrice, String savedAmount) {
        this.totalItems = totalItems;
        this.totalItemsPrice = totalItemsPrice;
        this.deliveryFee = deliveryFee;
        this.totalPrice = totalPrice;
        this.savedAmount = savedAmount;
        this.viewType = viewType;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getTotalItemsPrice() {
        return totalItemsPrice;
    }

    public void setTotalItemsPrice(String totalItemsPrice) {
        this.totalItemsPrice = totalItemsPrice;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(String savedAmount) {
        this.savedAmount = savedAmount;
    }

    // Cart Total Amount Layout
}
