package com.example.umart3;

public class MyWishlistModel {

    private int productImage;
    private String productTitle;
    private String productSeller;
    private String productPrice;
    private String productCutPrice;

    public MyWishlistModel(int productImage, String productTitle, String productSeller, String productPrice, String productCutPrice) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productSeller = productSeller;
        this.productPrice = productPrice;
        this.productCutPrice = productCutPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductSeller() {
        return productSeller;
    }

    public void setProductSeller(String productSeller) {
        this.productSeller = productSeller;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCutPrice() {
        return productCutPrice;
    }

    public void setProductCutPrice(String productCutPrice) {
        this.productCutPrice = productCutPrice;
    }
}
