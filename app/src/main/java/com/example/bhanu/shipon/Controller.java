package com.example.bhanu.shipon;

import android.app.Application;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by bhanu on 4/27/2018.
 */

public class Controller extends Application implements Serializable{
    private ArrayList<ShopProduct> myproducts = new ArrayList<>();
    private ShoppingCart myCart = new ShoppingCart();
    public ShopProduct getProducts(int pPosition){
        return myproducts.get(pPosition);
    }
    public void  setProducts(ShopProduct products){
        myproducts.add(products);
    }
    public ShoppingCart getCart(){
        return myCart;
    }
    public int  getProductArraylistsize(){
        return myproducts.size();
    }
}
