package com.example.bhanu.shipon;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by bhanu on 3/30/2018.
 */

public class ShoppingCart implements Serializable{
    private ArrayList<ShopProduct> cartItems = new ArrayList<>();
    public ShopProduct getProducts(int position){
        return cartItems.get(position);
    }

    public void setProducts(ShopProduct products){
        cartItems.add(products);
    }

    public int getCartSize(){
        return cartItems.size();
    }
    public boolean CheckProductInCart(ShopProduct aproduct){
        return cartItems.contains(aproduct);
    }
    public Bitmap getItemImage() {
        return itemImage;
    }

    public void setItemImage(Bitmap itemImage) {
        this.itemImage = itemImage;
    }

    Bitmap itemImage;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    String price;


}
