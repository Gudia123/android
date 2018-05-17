package com.example.bhanu.shipon;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bhanu on 4/26/2018.
 */

public class Cart extends AppCompatActivity {

    boolean isEmpty =true;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        LinearLayout emptyCartLayout = (LinearLayout) findViewById(R.id.cart_empty);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!bundle"+ bundle);
        final Controller controller = (Controller) bundle.get("products");
        System.out.println("print controller..................."+ controller);
        int productsize = controller.getProductArraylistsize();
        if(productsize == 0){
            emptyCartLayout.setVisibility(View.VISIBLE);
        } else {
            emptyCartLayout.setVisibility(View.GONE);
        }


        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_cart_layout);

        // inflate (create) another copy of our custom layout
        for(int i = 0; i< productsize; i++){
            System.out.println("inside cart for loop"+controller.getProducts(i).getProductDesc() );

            LayoutInflater inflater = getLayoutInflater();
            View myLayout = inflater.inflate(R.layout.cart_checkout_item, mainLayout, false);

            // make changes to our custom layout and its subviews
            ImageView imageView = (ImageView)findViewById(R.id.checkout_item);
           // imageView.setImageBitmap(controller.getProducts(i).getImg());
            TextView tDesc = (TextView) myLayout.findViewById(R.id.item_desc);
            tDesc.setText(controller.getProducts(i).getProductDesc());
            TextView tPrice =(TextView) myLayout.findViewById(R.id.item_price);
            tPrice.setText(controller.getProducts(i).getProductPrice());

            // add our custom layout to the main layout
            mainLayout.addView(myLayout);


        }

    }


}
