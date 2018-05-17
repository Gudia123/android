package com.example.bhanu.shipon;

import android.graphics.Bitmap;
import android.net.Uri;

import java.io.Serializable;

/**
 * Created by bhanu on 3/27/2018.
 */

class ShopProduct implements Serializable{
    transient private Bitmap img;

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public int getProductPrice() {
        return productPrice;
    }

    private String productName;
    private String productDesc;

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    private int productPrice;


    public ShopProduct(String productName, String productDesc, int productPrice, Bitmap img){
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.img = img;
    }

    public Bitmap getImg(){
        return img;
    }
     public void setImg(Bitmap image){
         this.img = image;
     }





}
