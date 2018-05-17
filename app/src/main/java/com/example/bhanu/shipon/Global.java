package com.example.bhanu.shipon;

import android.graphics.Bitmap;

/**
 * Created by bhanu on 3/30/2018.
 */

public class Global {

    public static String name;
    public static String desc;
    public static int price;

    public static Bitmap getBitmap() {
        return bitmap;
    }

    public static void setBitmap(Bitmap bitmap) {
        Global.bitmap = bitmap;
    }

    static Bitmap bitmap;

}
